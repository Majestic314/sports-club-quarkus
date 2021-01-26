package ru.rsatu.services;

import ru.rsatu.model.Coach;
import ru.rsatu.model.response.GetCoachList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class CoachService {

    @Inject
    EntityManager entityManager;

    public GetCoachList getCoachList() {
        GetCoachList result = new GetCoachList();
        Query query = entityManager.createQuery("select ch from coach ch");
        List<Coach> groupList = query.getResultList();

        result.setCoachList(groupList);
        return result;
    }
}
