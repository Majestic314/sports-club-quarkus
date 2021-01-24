package ru.rsatu.model.response;

import ru.rsatu.model.Subscription;

import java.util.List;

public class GetSubscriptionList {

    private List<Subscription> subscriptionList;

    public GetSubscriptionList() {
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }
}
