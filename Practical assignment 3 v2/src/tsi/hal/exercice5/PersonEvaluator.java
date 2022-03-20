package tsi.hal.exercice5;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.Comparator;

import java.util.List;


public class PersonEvaluator {

    void groupAndPrint(){
        Arrays persons;
        persons.stream()
                .filter(person -> person.age > 18)
                .forEach(System.out::println);
    }

    void groupByAge(){
        Arrays persons;
        persons.stream()
                .sorted(Comparator.comparingInt(s -> s.age))
                .forEach(System.out::println);
    }

    void findAndPrint() {
        Arrays persons;
        persons.stream()
                .filter(person -> person.name.startsWith("P"))
                .forEach(System.out::println);
    }

    void getAverageAge(){
        Arrays persons;
        int n = persons.size();
        List<Integer> sumAge = new ArrayList<>();
        for (int i=0;i<n;i++){
            sumAge.add(persons.get(i).age);
        }

}}
