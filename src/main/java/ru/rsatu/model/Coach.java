package ru.rsatu.model;

import javax.persistence.*;

@Entity(name = "coach")
@Table(name = "coach")
public class Coach {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "coach")
    private Group group;
}
