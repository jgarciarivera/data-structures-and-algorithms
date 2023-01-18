package com.jgarciarivera.practice;

// Determines the max value of a subarray size 3
public class MaxValueSubarray {

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int max = maxValue(array);
        System.out.println("Max value: " + max);
    }
    public static int maxValue(int[] array) {
        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 2; i++) {
            int currentSubarraySum = array[i] + array[i + 1] + array[i + 2];
            if (currentSubarraySum > maxSoFar) {
                maxSoFar = currentSubarraySum;
            }
        }

        return maxSoFar;
    }
}
