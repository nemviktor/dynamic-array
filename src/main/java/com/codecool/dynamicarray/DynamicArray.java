package com.codecool.dynamicarray;

public class DynamicArray {
    private int[] array;

    public DynamicArray(int capacity) {
        array = new int[capacity];
//        if (capacity == 4) {
//            array = new int[];
//        }
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
        for (int i=0;i<currentSize;i++) {
            currentIndex = i;
            if (array[i] == 0) {
                break;
            }
        }

        if (currentIndex != size()-1) {
            array[currentIndex] = value;
        } else {
            int len = array.length;
            array = new int[2*len];
            array[len] = value;
        }
    }

    public int get(int index) {
        try {
            System.out.println(array[index]);
            return array[index];
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println(exp);
            return 0;
        }
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
