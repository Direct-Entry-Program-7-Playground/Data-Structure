package ds;

import java.util.Arrays;

public class DynamicArray {
    protected int[] dynamicArray;

    public void add(int number) {

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        if (!empty()) {
            if ((index >= 0) && (index < dynamicArray.length)) {
                return dynamicArray[index];
            } else {
                throw new ArrayIndexOutOfBoundsException("Given index is out of bounds");
            }
        }
        throw new RuntimeException("Array is empty");
    }

    public void print() {
        System.out.println(Arrays.toString(dynamicArray));
    }

    public void clear() {
        dynamicArray = null;
    }

    public int size() {
        return dynamicArray == null ? 0 : dynamicArray.length;
    }

    public boolean contains(int number) {
        return false;
    }

    public boolean empty() {
        return true;
    }
}

