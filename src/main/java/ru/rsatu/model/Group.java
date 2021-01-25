package ru.rsatu.model;

import javax.persistence.*;

@Entity(name = "group_def")
@Table(name = "group_def")
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @Column(name = "group_type")
    private String groupType;

    @Column(name = "description")
    private String description;

    @Column(name = "subscription_visit_pool")
    private long subscriptionVisitPool;

    @Column(name = "subscription_price")
    private long subscriptionPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSubscriptionVisitPool() {
        return subscriptionVisitPool;
    }

    public void setSubscriptionVisitPool(long subscriptionVisitPool) {
        this.subscriptionVisitPool = subscriptionVisitPool;
    }

    public long getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(long subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }
}
