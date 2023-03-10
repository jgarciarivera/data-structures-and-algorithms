package com.jgarciarivera.practice;

// Determines the max value of a subarray of size k in an array size n
// Demonstrates the sliding window technique with a fixed size window
public class MaxValueSubarray {

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int subarraySize = 3;
        int result = findMaxValue(array, subarraySize);
        System.out.println("Max value: " + result);
    }
    public static int findMaxValue(int[] array, int subarraySize) {
        int maxSum  = Integer.MIN_VALUE;
        int runningSum = 0;
        for (int i = 0; i < array.length; i++) {
            runningSum = runningSum + array[i];
            if (i >= subarraySize - 1) {
                if (runningSum > maxSum) {
                    maxSum = runningSum;
                }
                runningSum = runningSum - array[i - (subarraySize - 1)];
            }
        }
        return maxSum;
    }
}
