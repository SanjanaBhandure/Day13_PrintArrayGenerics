/*
 * Given an array of Integer, Double and Character, write a program to print the UC 2 same using Generics class
 *
 * @author: Sanjana Bhandure
 * @version: 1.3
 * @date: 1-5-2022
 */

package com.Bridgelabz.Day13PrintArrayGenerics;

public class PrintArray <T>{
    private T[] myArray;

    //constructor
    public PrintArray(T[] myArray) {
        super();
        this.myArray = myArray;
    }

    /*
     * generic array printing
     */
    static public <T> void printArray(T[] arr) {
        for (T element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    /*
     * generic array printing using class
     */
    private void printArray() {
        printArray(myArray);
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 10, 20, 30 };
        Double[] arr2 = { 1.23, 2.24, 3.345 };
        Character[] arr3 = { 'a', 'A', 'V' };

        // using generic methods
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

        // using class objects
        new PrintArray<Integer>(arr1).printArray();
        new PrintArray<Double>(arr2).printArray();
        new PrintArray<Character>(arr3).printArray();
    }
}
