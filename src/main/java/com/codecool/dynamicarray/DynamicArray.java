package com.codecool.dynamicarray;


public class DynamicArray {
    private int[] array;
    private int lastAddedIndex = -1;

    public DynamicArray(int capacity) {
        array = new int[capacity];
    }

    public DynamicArray() {
        array = new int[4];
    }

    public int getCapacity() {
        int i =0;
        while (true) {
            try{
                array[i] = i+1;
                i++;
            } catch (ArrayIndexOutOfBoundsException exp) {
//                throw exp;
                return i;
            }
        }
    }

    public int size() {
        try{
            int i = 0;
            for (Integer my_int : array) {
                i++;
            }
            return i;
        } catch (NullPointerException exp) {
            return 0;
        }

    }

    public void add(int value) {
        int currentSize = size();
        System.out.println("current size: " + currentSize);
        System.out.println("So double it before adding a new element!");
        if (currentSize != 0) {
            if (lastAddedIndex != size()-1) {
                array[lastAddedIndex+1] = value;
            } else {
                int len = array.length; //1
                int[] new_array = new int[2*len]; //2
                for (int i=0;i<len;i++) {
                    new_array[i] = array[i];
                }
                new_array[len] = value;
                array = new_array;
            }
            lastAddedIndex++;
        } else {
            array = new int[1];
            array[0] = value;
            lastAddedIndex++;
        }
        for (int _myint : array) {
            System.out.print(_myint);
            System.out.print(",");
        }
        System.out.print("\n");
    }

    public int get(int index) {
        try {
            System.out.println(array[index]);
            return array[index];
        } catch (ArrayIndexOutOfBoundsException exp) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void remove(int indexToBeRemoved) {
        int[] temp = new int[size()-1];
        try {
            for (int i=0;i<indexToBeRemoved;i++) {
                temp[i] = array[i];
            }
            for (int i=indexToBeRemoved+1;i<size();i++) {
                temp[i-1] = array[i];
            }
            array = temp;
        } catch (ArrayIndexOutOfBoundsException exp) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void insert(int index, int newValue) {
        try {
            if (index > size()) {
                array[size()-1] = newValue;
            } else {
                int[] temp = new int[size()+1];
                for (int i=0;i<index;i++) {
                    temp[i] = array[i];
                }
                temp[index] =newValue;
                for (int i=index;i<size();i++) {
                    temp[i+1] = array[i];
                }
                array = temp;
            }
        } catch (ArrayIndexOutOfBoundsException exp) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size() == 0) {
            sb.append("[]");
        } else {
            sb.append("[" + array[0]);
            for (int i =1;i<size();i++) {
                sb.append(", " + array[i]);
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
