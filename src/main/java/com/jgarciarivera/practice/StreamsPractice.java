package com.jgarciarivera.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsPractice {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a2", "a1", "b1", "b2", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(s -> System.out.println(s));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(-1);
        numbers.add(8);
        numbers.add(2);
        numbers.add(0);
        numbers.add(-2);

        numbers.stream()
                .filter(n -> n >= 0)
                .distinct()
                .sorted()
                .forEach(n -> System.out.println(n));

    }
}
