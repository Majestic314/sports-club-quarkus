package ru.rsatu.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Subscription {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "client_id")
    private long clientId;

    @Column(name = "group_id")
    private long groupId;

    @Column(name = "valid_from_date")
    private Date validFromDate;

    @Column(name = "valid_to_date")
    private Date validToDate;

    @Column(name = "visits_left")
    private long visitsLeft;

}
