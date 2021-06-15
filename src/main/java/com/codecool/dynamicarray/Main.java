package com.codecool.dynamicarray;

public class Main {
    public static void main(String[] args) {
        System.out.println("Execute all tests to check your work.");
        DynamicArray myArray = new DynamicArray(3);
        System.out.println(myArray.size());
        myArray.add(2);
        System.out.println(myArray.size());
        myArray.add(2);
        System.out.println(myArray.size());
        myArray.add(2);
        System.out.println(myArray.size());
    }
}
