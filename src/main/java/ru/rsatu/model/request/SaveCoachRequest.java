package ru.rsatu.model.request;

import ru.rsatu.model.Coach;

public class SaveCoachRequest {

    public Coach coach;

    public SaveCoachRequest() {}

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
