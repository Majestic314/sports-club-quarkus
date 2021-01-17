package ru.rsatu.services;

import ru.rsatu.model.Group;
import ru.rsatu.model.response.GetGroupList;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@ApplicationScoped
public class GroupService {

    @Inject
    EntityManager entityManager;

    public GetGroupList getGroupList() {
        GetGroupList result = new GetGroupList();
        Query query = entityManager.createQuery("select gd from group_def gd");
        List<Group> groupList = query.getResultList();

        result.setGroupList(groupList);
        return result;
    }
}
