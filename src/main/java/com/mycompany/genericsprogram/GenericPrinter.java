package com.mycompany.genericsprogram;

public class GenericPrinter {

    public static <E> void printArray(E[] inputArray) {
        //Display array elements
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
