package com.client;

import com.google.inject.Inject;
import com.injector.annotation.MessengerAnnotation;
import com.resource.MessageService;

public class FacebookMessenger {

    private MessageService service;

    @Inject
    /**
     * We use @Inject annotation to make explicit that MessageService constructor is invoked by Guice
     * An annotated binding @MessengerAnnotation is being used as multiple bindings of the same type(MessageService)
     * have been done
     */
    public FacebookMessenger(@MessengerAnnotation MessageService msgSVC) {
        this.service = msgSVC;
    }

    public boolean sendMessage(String message, String recipient) {
        return this.service.sendMessage(message,recipient);
    }

}
