package ru.rsatu.model.response;

import ru.rsatu.model.Group;

import java.util.List;

public class GetGroupList {

    private List<Group> groupList;

    public GetGroupList() {
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
//        for (Group group : groupList) {
//            this.groupList.add((Group) group);
//        }
    }
}
