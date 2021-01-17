package ru.rsatu.model;

import javax.persistence.*;

@Entity(name = "group_def")
@Table(name = "group_def")
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "coach_id")
    private long coachId;

    @Column(name = "group_type")
    private String groupType;

    @Column(name = "subscription_visit_pool")
    private long subscriptionVisitPool;
}
