package ru.rsatu.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "subscription")
@Table(name = "subscription")
public class Subscription {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @Column(name = "valid_from_date")
    private Date validFromDate;

    @Column(name = "valid_to_date")
    private Date validToDate;

    @Column(name = "visits_left")
    private long visitsLeft;
}
