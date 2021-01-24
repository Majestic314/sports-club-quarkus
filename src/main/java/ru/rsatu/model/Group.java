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

    @Column(name = "subscription_visit_pool")
    private long subscriptionVisitPool;

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

    public long getSubscriptionVisitPool() {
        return subscriptionVisitPool;
    }

    public void setSubscriptionVisitPool(long subscriptionVisitPool) {
        this.subscriptionVisitPool = subscriptionVisitPool;
    }
}
