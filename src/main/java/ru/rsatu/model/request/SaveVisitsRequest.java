package ru.rsatu.model.request;

import ru.rsatu.model.Client;

import java.util.List;

public class SaveVisitsRequest {

    public List<Client> clients;

    public SaveVisitsRequest() {}

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
