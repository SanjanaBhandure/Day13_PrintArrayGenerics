/*
 * Given an array of Integer, Double and Character, write a program to print the same -
 * Create PrintArray class and define toPrint method to print corresponding elements to stdout
 *
 * @author: Sanjana Bhandure
 * @version: 1.0
 * @date: 1-5-2022
 */
package com.Bridgelabz.Day13PrintArrayGenerics;

public class PrintArray {
    /*
     * printArray method created for printing integer array
     */
    static public void printArray(int[] arr) {
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    /*
     * printArray method created for printing float/double array
     */
    static public void printArray(double[] arr) {
        for (Double element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    /*
     * printArray method created for printing string array
     */
    static public void printArray(char[] arr) {
        for (char element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        double[] arr2 = { 1.23, 2.24, 3.345 };
        char[] arr3 = { 'a', 'A', 'V' };
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}
