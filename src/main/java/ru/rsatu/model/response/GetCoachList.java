package ru.rsatu.model.response;

import ru.rsatu.model.Coach;

import java.util.List;

public class GetCoachList {

    private List<Coach> groupList;

    public GetCoachList() {
    }

    public List<Coach> getCoachList() {
        return groupList;
    }

    public void setCoachList(List<Coach> groupList) {
        this.groupList = groupList;
    }
}
