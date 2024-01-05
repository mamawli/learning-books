package com.javad.service;

import com.javad.model.Client;
import com.javad.model.Template;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Messenger {

    private final TemplateEngine templateEngine;
    private final MailServer mailServer;

    public void sendMessage(Client client, Template template){
        var content = templateEngine.prepareMessage(template, client);
        mailServer.send(client.getEmail(), content);
    }
}
