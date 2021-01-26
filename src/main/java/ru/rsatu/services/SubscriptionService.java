package ru.rsatu.services;

import ru.rsatu.model.Client;
import ru.rsatu.model.Subscription;
import ru.rsatu.model.response.GetSubscriptionList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SubscriptionService {

    @Inject
    EntityManager entityManager;

    public GetSubscriptionList getSubscriptionList(long groupId) {
        GetSubscriptionList result = new GetSubscriptionList();
        String queryString = "select sb from subscription sb";
        if (groupId > 0) {
            queryString += " where sb.group=" + groupId;
        }
        Query query = entityManager.createQuery(queryString);
        List<Subscription> subscriptionList = query.getResultList();

        result.setSubscriptionList(subscriptionList);
        return result;
    }

    @Transactional
    public void saveVisits(List<Client> clientList) {
        if (clientList == null || clientList.size() == 0) {
            return;
        }
        String queryString = "select sb from subscription sb where sb.client in ("
                + toListOfIds(clientList) + ")";
        Query query = entityManager.createQuery(queryString);
        List<Subscription> subscriptionList = query.getResultList();
        for (Subscription subscription : subscriptionList) {
            subscription.setVisitsLeft(subscription.getVisitsLeft() - 1);
            if (subscription.getVisitsLeft() <= 1) {
                entityManager.remove(subscription);
            } else {
                entityManager.persist(subscription);
            }
        }
    }

    private String toListOfIds(List<Client> clientList) {
        StringBuilder listOfIds = new StringBuilder();
        for (Client client : clientList) {
            listOfIds.append(client.getId()).append(", ");
        }
        listOfIds.setLength(listOfIds.length() - 2);
        return listOfIds.toString();
    }
}
