package com.company;

@FunctionalInterface
public interface Command<T> {

    void execute(T obj);
}
