package ru.rsatu.model;

import javax.persistence.*;
import java.util.Collection;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
    private Collection<Subscription> subscriptions;
}
