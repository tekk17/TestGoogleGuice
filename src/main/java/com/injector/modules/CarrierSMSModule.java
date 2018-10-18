package com.injector.modules;

import com.google.inject.AbstractModule;
import com.injector.provider.CarrierSMSProvider;
import com.resource.MessageService;

/**
 * To create bindings, extend AbstractModule and override its configure method.
 * In the method body, call bind() to specify each binding
 */
public class CarrierSMSModule extends AbstractModule {

    @Override
    protected void configure() {
        /**
         * Linked bindings map a type to its implementation
         */
        bind(MessageService.class).toProvider(CarrierSMSProvider.class);
    }
}
