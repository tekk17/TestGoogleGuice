package com.injector.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.injector.annotation.AppleAnnotation;
import com.resource.MessageService;
import com.service.iMessages;

/**
 * To create bindings, extend AbstractModule and override its configure method.
 * In the method body, call bind() to specify each binding
 */
public class iMessagesProvides extends AbstractModule {

    @Override
    protected void configure() {

    }

    /**
     * When you need code to create an object, use an @Provides method.
     * The method must be defined within a module, and it must have an @Provides annotation
     * The method's return type is the bound type
     * If the @Provides method has a binding annotation like @AppleAnnotation, Guice binds the annotated type
     * @return
     */
    @Provides
    @AppleAnnotation
    MessageService initializeIMessages() {
        iMessages messageService = new iMessages();
        messageService.iPhoneModel = "iPhoneXs";
        return messageService;
    }
}
