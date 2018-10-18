package com.service;

import com.resource.MessageService;

public class Messenger implements MessageService {
    public boolean sendMessage(String message, String recipient) {
        System.out.println("Message : " + message + " sent using facebook messenger to: " + recipient);
        return true;
    }
}
