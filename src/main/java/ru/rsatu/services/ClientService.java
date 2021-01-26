package ru.rsatu.services;

import ru.rsatu.model.Client;
import ru.rsatu.model.response.GetClientList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class ClientService {

    @Inject
    EntityManager entityManager;

    public GetClientList getClientList(long coachId) {
        GetClientList result = new GetClientList();
        String queryString = "select cl from client cl";
        if (coachId > 0) {
            queryString += " where cl.id in (select sub.client from subscription sub"
                    + " where sub.group in (select gd.id from group_def gd"
                    + " where gd.coach = " + coachId + "))";
        }
        Query query = entityManager.createQuery(queryString);
        List<Client> groupList = query.getResultList();

        result.setClientList(groupList);
        return result;
    }
}
