package com.javad.service;

import com.javad.model.ClientModel;
import com.javad.model.Template;

public interface TemplateEngine {

    String prepareMessage(Template template, ClientModel clientModel);
}
