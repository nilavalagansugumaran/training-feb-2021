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

        // using - lambda pass multiple parameters and return value
        Calculator<Integer> cal1 = (a, b) -> {
            return a+b;
        };
        System.out.println("Calculation 1 ... " + cal1.calc(10,20));

        Calculator<Integer> cal2 = (a, b) -> {
            return a*b;
        };
        System.out.println("Calculation 2 ... " + cal2.calc(10,20));

        // using method reference ::
        PersonProvider personProvider = Person::new;
       Person person2 = personProvider.getPerson();
       process(person2,personCommandSimplified2 );

        PersonProviderOther personProviderOther = Person::new; // new Person("new customer", 35)
        Person person3 = personProviderOther.getPerson("new customer", 35);
        process(person3,personCommandSimplified2 );

        NameProvider nameProvider = Person::getName; // call methods
        String name = nameProvider.getName(person3);
        System.out.println("Name is - " + name);

    }

    public static <T> void process(T obj, Command<T> command) {
        command.execute(obj);
    }
}
