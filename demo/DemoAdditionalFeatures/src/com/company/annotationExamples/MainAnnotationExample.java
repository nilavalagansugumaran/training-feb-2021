package com.company.annotationExamples;

@MyAnnotation(value = "123", names = {"at class", "class2"}) // using annotation
public class MainAnnotationExample {


    //@MyAnnotation // can not use because it is not marked for variables
    private String myVariable;

    @MyAnnotation(names = "at method")
    public void testMethod() {

    }
}
