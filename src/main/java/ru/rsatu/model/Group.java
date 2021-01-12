package ru.rsatu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    private long coachId;

    private String groupType;

    private long subscriptionDuration;
}
