package ru.rsatu.model.response;

import ru.rsatu.model.Coach;

public class SaveCoachResponse {

    private Coach coach;

    public SaveCoachResponse() {
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
