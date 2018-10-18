package com.service;

import com.resource.MessageService;

public class iMessages implements MessageService {
    public String iPhoneModel;

    public boolean sendMessage(String message, String recipient) {
        System.out.println("Message : " + message + " sent using AppleiMessages to: " + recipient + "on the iPhone model: "
                                   + iPhoneModel);
        return true;
    }
}
