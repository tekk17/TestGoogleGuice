package com.client;

import com.google.inject.Inject;
import com.resource.MessageService;

public class AirtelCarrierSMS {
    private MessageService messageService;

    /**
     * We use @Inject annotation to make explicit that MessageService constructor is invoked by Guice
     * @param messageService
     */
    @Inject
    public AirtelCarrierSMS(MessageService messageService) {
        this.messageService = messageService;
    }

    public boolean sendSMS(final String message, final String recipient) {
        return this.messageService.sendMessage(message, recipient);
    }
}
