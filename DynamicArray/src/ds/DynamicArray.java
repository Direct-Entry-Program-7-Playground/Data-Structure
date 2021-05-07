package ds;

import java.util.Arrays;

public class DynamicArray {
    protected int[] dynamicArray;

    public void add(int number) {

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {
        if (!empty()) {
            int dynamicArrayLength = dynamicArray.length;
            if ((index >= 0) && (index < dynamicArrayLength)) {
                if (dynamicArrayLength == 1) {
                    dynamicArray = null;
                } else {
                    int[] newDynamicArray = new int[dynamicArrayLength - 1];
                    for (int i = 0; i < dynamicArrayLength; i++) {
                        if (i < index) {
                            newDynamicArray[i] = dynamicArray[i];
                        } else {
                            newDynamicArray[i] = dynamicArray[i + 1];
                        }
                    }
                    dynamicArray = newDynamicArray;
                }
            } else {
                throw new ArrayIndexOutOfBoundsException("Given index is out of bounds");
            }
        }
        throw new RuntimeException("Array is empty");
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
        if (!this.empty()) {
            for (int num :
                    dynamicArray) {
                if (num == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean empty() {
        return (dynamicArray == null) || (dynamicArray.length == 0);
    }
}

