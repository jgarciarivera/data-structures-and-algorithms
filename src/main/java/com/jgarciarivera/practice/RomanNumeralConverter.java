package com.jgarciarivera.practice;

public class RomanNumeralConverter {

    public int toDecimal(String roman) {
        int sum = 0;
        int previous = 0;

        for (int i = 0; i < roman.length(); i++) {
            int current = getIntValueFromLetter(String.valueOf(roman.charAt(i)));

            if (previous < current) {
                sum = sum - previous;
                sum = sum + (current - previous);
            } else {
                sum = sum + current;
            }

            previous = current;
        }

        return sum;
    }

    private static int getIntValueFromLetter(String roman) {
        switch(roman) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                throw new IllegalArgumentException("Roman numeral must consist of I, V, X, L, C, D, M");
        }
    }
}
