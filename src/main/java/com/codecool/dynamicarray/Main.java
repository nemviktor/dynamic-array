package com.codecool.dynamicarray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Execute all tests to check your work.");
        DynamicArray myArray = new DynamicArray(2);
        System.out.println(myArray);
        System.out.println(myArray.size());

        myArray.add(2);
        System.out.println(myArray.toString());
        System.out.println(myArray.size());

        myArray.add(2);
        System.out.println(myArray.toString());
        System.out.println(myArray.size());

        myArray.add(2);
        System.out.println(myArray.toString());
        System.out.println(myArray.size());
    }
}
