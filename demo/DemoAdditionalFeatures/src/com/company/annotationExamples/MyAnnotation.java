package com.company.annotationExamples;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS) // How long it needs to be visible
@Target({ElementType.METHOD, ElementType.TYPE}) // Where you can apply the annotations
public @interface MyAnnotation {

    // Additional values
    String value() default "none";
    String[] names();
}
