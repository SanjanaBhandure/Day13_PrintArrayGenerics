/*
 * Given an array of Integer, Double and Character, write a program to print the UC 2 same using Generics
 *
 * @author: Sanjana Bhandure
 * @version: 1.2
 * @date: 1-5-2022
 */

package com.Bridgelabz.Day13PrintArrayGenerics;

public class PrintArray {
    // generic array printing
    static public <T> void printArray(T[] arr) {
        for (T element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 10, 20, 30 };
        Double[] arr2 = { 1.23, 2.24, 3.345 };
        Character[] arr3 = { 'a', 'A', 'V' };
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }
}
