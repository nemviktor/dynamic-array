package com.codecool.dynamicarray;

public class DynamicArray {
    private int[] array;

    public DynamicArray(int capacity) {
        array = new int[capacity];
    }

    public DynamicArray() {
    }

    public int getCapacity() {
        int i =0;
        while (true) {
            try{
                array[i] = i+1;
                i++;
            } catch (ArrayIndexOutOfBoundsException exp) {
//                System.out.println("Exception caught!");
                break;
            }
        }
        return i;
    }

    public int size() {
        int i = 0;
        for (Integer my_int : array) {
            i++;
        }
        return i;
    }

    public void add(int value) {
        int currentSize = size();
        int currentIndex = 0;
//        for (int i=0;i<currentSize;i++) {
//            if (array[i] == null) {
//
//            }
//        }
        try {
            this.array[currentIndex+1] = value;
        } catch (Exception e) {
            System.out.println("Cannot add element. Index out of range.");
        }
        System.out.println(size());
    }

    public int get(int index) {
        return 0;
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
