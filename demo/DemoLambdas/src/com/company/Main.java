package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Person person1 = new Person("Nila", 38);

        // anonymous class
        Command<Person> personCommand = new Command<Person>() {
            @Override
            public void execute(Person obj) {
                System.out.println(obj.getName());
            }
        };
        personCommand.execute(person1);


        // using lambda - single statement
        Command<Person> personCommandSimplified1 = (p) -> System.out.println(p.getName()); // {} optional
        personCommandSimplified1.execute(person1);

        // using lambda - multiple statements
        Command<Person> personCommandSimplified2 = (p) ->{ // use {}
            System.out.println("multi statement " + p.getName());
            System.out.println("multi statement " +p.getAge());
        };
        personCommandSimplified2.execute(person1);

        // using lambda - pass code to a method
        process(person1,personCommandSimplified2 );
        process(person1, (p) -> {System.out.println("Passing the code " + p.getName());} );

    }

    public static <T> void process(T obj, Command<T> command) {
        command.execute(obj);
    }
}
