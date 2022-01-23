package com.mycompany.genericsprogram;

public class PrinterTester {

    public static void main(String[] args) {
        //values of different data type to be sorted
        Integer[] intArray = {4, 7, 9, 1, 9, 10, 2};
        Double[] doubleArray = {1.45, 2.09, 1.11, 13.86, 10.22, 9.35};
        Character[] charArray = {'P', 'H', 'I', 'K', 'J', 'Z', 'L'};
        String[] stringArray = {"Chinasa", "Kemi", "Sola", "Deborah", "Joy", "Bayo"};

        System.out.println("Printing Library without genrics");
        // Calling non Generic Printing methods
        Printer.printArrayCharacter(charArray);
        Printer.printArrayDouble(doubleArray);
        Printer.printArrayInt(intArray);
        Printer.printArrayString(stringArray);

        System.out.println("-------------------------------------");
        System.out.println("Printing Library with genrics");
        // Calling the  Generic Printing method
        GenericPrinter.printArray(charArray);
        GenericPrinter.printArray(doubleArray);
        GenericPrinter.printArray(intArray);
        GenericPrinter.printArray(stringArray);
    }
}
