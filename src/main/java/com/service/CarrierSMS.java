package com.service;

import com.resource.MessageService;

public class CarrierSMS implements MessageService {
    public String carrierName;
    public String carrierRegion;

    public boolean sendMessage(String message, String recipient) {
        System.out.println("Message: " + message + " sent using SMS Service to : " + recipient + " using: "
                                   + carrierName + " present in: " + carrierRegion);
        return true;
    }
}
