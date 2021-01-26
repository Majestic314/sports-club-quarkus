package ru.rsatu.model.response;

import ru.rsatu.model.Client;

import java.util.List;

public class GetClientList {

    private List<Client> clientList;

    public GetClientList() {
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
}
