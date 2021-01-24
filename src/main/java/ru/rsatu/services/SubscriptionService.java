package ru.rsatu.services;

import ru.rsatu.model.Subscription;
import ru.rsatu.model.response.GetSubscriptionList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
}
