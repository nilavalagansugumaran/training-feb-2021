package com.example.outer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyOuterBean {

    @Value("${myprop.name}") // injecting values from properties
    private String name;

    @Value("${myprop.address: default address}") // default value
    private String address;

    @Override
    public String toString() {
        return "MyOuterBean{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
