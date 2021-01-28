package ru.rsatu.services;

import ru.rsatu.model.Coach;
import ru.rsatu.model.response.GetCoachList;
import ru.rsatu.model.response.SaveCoachResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
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

    @Transactional
    public SaveCoachResponse saveCoach(Coach newCoach) {
        SaveCoachResponse response = new SaveCoachResponse();
        if (newCoach == null) {
            return null;
        }
        entityManager.persist(newCoach);
        response.setCoach(newCoach);
        return response;
    }
}
