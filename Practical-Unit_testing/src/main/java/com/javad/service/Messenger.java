package com.javad.service;

import com.javad.model.ClientModel;
import com.javad.model.Template;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Messenger {

    private final TemplateEngine templateEngine;
    private final MailServer mailServer;

    public void sendMessage(ClientModel clientModel, Template template){
        var content = templateEngine.prepareMessage(template, clientModel);
        mailServer.send(clientModel.getEmail(), content);
    }
}
