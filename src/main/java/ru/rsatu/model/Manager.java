package ru.rsatu.model;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "manager")
@Table(name = "manager")
public class Manager {

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "manager")
    private Collection<Subscription> issuedSubscriptions;
}
