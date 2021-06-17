package com.codecool.dynamicarray;


public class DynamicArray {
    private int[] array;
    private int capacity;
    private int size = 0;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
    }

    public DynamicArray() {
        this.capacity = 4;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public void add(int value) {
        if (size<capacity) {
            if (size == 0) {
                array = new int[1];
                array[0] = value;
                size = 1;
            } else {
                int[] temp = new int[size+1];
                for (int i=0;i<size;i++) {
                    temp[i] = array[i];
                }
                temp[size] = value;
                array = temp;
                size = array.length;
            }
        } else if (size == capacity) {
            capacity = 2 * capacity;
            int[] temp = new int[size+1];
            for (int i=0;i<size;i++) {
                temp[i] = array[i];
            }
            temp[size] = value;
            array = temp;
            size = array.length;
        }
    }

    public int get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else {
            return array[index];
        }
    }

    public void remove(int indexToBeRemoved) {
        if (indexToBeRemoved < size && indexToBeRemoved > -1) {
            int[] temp = new int[size-1];
            for (int i=0;i<indexToBeRemoved;i++) {
                temp[i] = array[i];
            }
            for (int i=indexToBeRemoved+1;i<size;i++) {
                temp[i-1] = array[i];
            }
            array = temp;
            size = array.length;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void insert(int index, int newValue) {
        if (index < size && index > -1) {
            int[] temp = new int[size+1];
            for (int i=0;i<index;i++) {
                temp[i] = array[i];
            }
            temp[index] =newValue;
            for (int i=index;i<size;i++) {
                temp[i+1] = array[i];
            }
            array = temp;
            size = array.length;
        } else if (index >= size) {
            array[size-1] = newValue;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == capacity) {
            capacity = 2 * capacity;
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
