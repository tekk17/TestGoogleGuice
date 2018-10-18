package com.injector.modules;

import com.google.inject.AbstractModule;
import com.injector.annotation.MessengerAnnotation;
import com.resource.MessageService;
import com.service.Messenger;

/**
 * To create bindings, extend AbstractModule and override its configure method.
 * In the method body, call bind() to specify each binding
 * The modules are the building blocks of an injector, which is Guice's object-graph builder.
 */
public class FacebookMessengerInjector extends AbstractModule {

    @Override
    protected void configure() {
        /**
         * Linked bindings map a type to its implementation
         * This tells Guice that whenever it sees a dependency on a MessageService,
         * it should satisfy the dependency using a Messenger.
         */
        bind(MessageService.class).annotatedWith(MessengerAnnotation.class).to(Messenger.class);
        /**
         * To depend on the annotated binding, apply the annotation to the injected parameter.
         * By using the annotatedWith clause in the bind() statement
         */
    }
}
