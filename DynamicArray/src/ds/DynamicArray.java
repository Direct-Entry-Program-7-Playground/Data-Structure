package ds;

public class DynamicArray {
    protected int[] dynamicArray;

    public void add(int number) {

    }

    public void add(int index, int number) {

    }

    public void remove(int index) {

    }

    public int get(int index) {
        return 0;
    }

    public void print() {
        System.out.print("[");
        if (!this.empty()) {
            int dynamicArrayLength = dynamicArray.length;

            for (int i = 0; i < dynamicArrayLength; i++) {
                if (i != (dynamicArrayLength - 1)) {
                    System.out.print(dynamicArray[dynamicArrayLength - 1 - i] + ",");
                } else {
                    System.out.print(dynamicArray[dynamicArrayLength - 1 - i]);
                }
            }
        }
        System.out.println("]");
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

