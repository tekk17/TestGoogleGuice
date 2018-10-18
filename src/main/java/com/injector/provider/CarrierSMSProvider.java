package com.injector.provider;

import com.google.inject.Provider;
import com.resource.MessageService;
import com.service.CarrierSMS;

/**
 * When our @Provides methods start to grow complex,
 * We can move them to a class of their own.
 * The provider class implements Guice's Provider interface
 * public interface Provider<T> {
 *   T get();
 * }
 */
public class CarrierSMSProvider implements Provider<MessageService> {
    public MessageService get() {
        CarrierSMS carrierSMS = new CarrierSMS();
        carrierSMS.carrierName  = "Airtel";
        carrierSMS.carrierRegion = "Karnataka";
        return carrierSMS;
    }
}
