package com.company;

@FunctionalInterface
public interface Command<T> {

    void execute(T obj);
}

@FunctionalInterface
interface Calculator<T> {

    T calc(T ob1, T ob2);
}

@FunctionalInterface
interface PersonProvider {

    Person getPerson(); // for default constructor
}


@FunctionalInterface
interface PersonProviderOther {

    Person getPerson(String name, int age); // for parameterised constructor
}


@FunctionalInterface
interface NameProvider {

    String getName(Person p);
}
