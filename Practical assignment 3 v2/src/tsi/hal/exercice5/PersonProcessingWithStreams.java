package tsi.hal.exercice5;


import java.util.ArrayList;

import java.util.List;


public class PersonProcessingWithStreams {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Max", 28));

        persons.add(new Person("Peter", 22));

        persons.add(new Person("Anna", 28));

        persons.add(new Person("Lilianna", 16));

        persons.add(new Person("Pamela", 13));

        persons.add(new Person("David", 22));

        System.out.println("\n" + "Name starting from P: ");

        System.out.println("\n" + "Older than 18: ");

        System.out.println("\n" + "Group by age: ");

    }
}

