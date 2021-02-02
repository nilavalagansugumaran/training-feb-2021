package com.company;

public enum Countries {


    UK("United Kingdom", "London"),
    IN("India", "New Delhi"),
    USA("United States of America", "Washington DC"),
    FR("France", "paris");

    // instance variables
    private String name;
    private String capital;

    // Constructors
    Countries(String name,String capital) { //Constructor
        this.name = name;
        this.capital = capital;
    }

    // can have supportive methods
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isInEurope(){
        return this == UK || this == FR;
    }
}
