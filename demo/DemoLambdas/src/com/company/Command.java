package com.company;

@FunctionalInterface
public interface Command<T> {

    void execute(T obj);
}

@FunctionalInterface
interface Calculator<T> {

    T calc(T ob1, T ob2);
}