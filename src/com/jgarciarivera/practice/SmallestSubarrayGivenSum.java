package com.jgarciarivera.practice;

// Determines the length of the smallest subarray whose sum is greater than or equal to specified target
// Demonstrates the sliding window technique with a dynamica sized window
public class SmallestSubarrayGivenSum {

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 7, 8, 1, 2, 8, 1, 0};
        int target = 9;
        int result = findSmallestSubarrayLength(array, target);
        System.out.println("Max value: " + result);
    }
    public static int findSmallestSubarrayLength(int[] array, int target) {
        int smallestSubarrayLength  = Integer.MAX_VALUE;

        // TODO: Implement

        return smallestSubarrayLength;
    }
}
