package com.javad.service;

import com.javad.model.Client;
import com.javad.model.Template;

public interface TemplateEngine {

    String prepareMessage(Template template, Client client);
}
