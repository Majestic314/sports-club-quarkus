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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Date getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(Date validFromDate) {
        this.validFromDate = validFromDate;
    }

    public Date getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(Date validToDate) {
        this.validToDate = validToDate;
    }

    public long getVisitsLeft() {
        return visitsLeft;
    }

    public void setVisitsLeft(long visitsLeft) {
        this.visitsLeft = visitsLeft;
    }
}
