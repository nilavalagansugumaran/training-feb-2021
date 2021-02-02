package com.company;

public class EnumExample {

    public static void main(String[] args) {
        System.out.println(Directions.SOUTH);
        System.out.println(Directions.SOUTH.name()); // print the name of the constant
        System.out.println(Directions.NORTH.ordinal()); // location in the enum

        System.out.println(Countries.UK);

        System.out.println(Countries.UK.getCapital());
        System.out.println(Countries.UK == Countries.USA);
        System.out.println(Countries.USA.getName());
        System.out.println(Countries.USA.isInEurope());

        System.out.println("Is France in EU = " +  Countries.FR.isInEurope());

        // Directions d = new Directions(); // can not instantiate
    }
}
