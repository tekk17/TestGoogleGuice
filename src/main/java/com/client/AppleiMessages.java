package com.client;

import com.google.inject.Inject;
import com.injector.annotation.AppleAnnotation;
import com.resource.MessageService;

public class AppleiMessages {
    private MessageService messageService;

    @Inject
    /**
     * We use @Inject annotation to make explicit that MessageService constructor is invoked by Guice
     * An annotated binding @MessengerAnnotation is being used as multiple bindings of the same type(MessageService)
     * have been done
     */
    public AppleiMessages(@AppleAnnotation MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean sendiMessage(String message, String recipient) {
        return this.messageService.sendMessage(message, recipient);
    }
}
