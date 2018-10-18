package com.injector.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * When multiple bindings of the same type is required, Bindings support an optional binding annotation.
 * The annotation and type together uniquely identify a binding. This pair is called a key.
 */
/**
 * @BindingAnnotation tells Guice that this is a binding annotation.
 * @Target({FIELD, PARAMETER, METHOD}) is a courtesy to your users.
 * @Retention(RUNTIME) makes the annotation available at runtime.
 */
@BindingAnnotation @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MessengerAnnotation {
}
