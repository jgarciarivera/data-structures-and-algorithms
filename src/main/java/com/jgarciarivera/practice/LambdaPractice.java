package com.jgarciarivera.practice;
public class LambdaPractice {

    public interface StringFunction {
        String run(String str);
    }

    public static void main(String[] args) {
        StringFunction exclaim = s -> s + "!";
        StringFunction ask = s -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction expression) {
        String result = expression.run(str);
        System.out.println(result);
    }
}
