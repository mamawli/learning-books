package com.javad.service;

import com.javad.model.Client;
import com.javad.model.Message;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RaceResultService {

    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void send(Message message) {
        clients.forEach(client -> client.receive(message));
    }

    public void removeSubscriber(Client client) {
        clients.remove(client);
    }
}
