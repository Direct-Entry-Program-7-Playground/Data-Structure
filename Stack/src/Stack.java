import java.util.Arrays;

public class Stack {
    private int[] numberArray;

    public void push(int number) {
        int numberArrayLength = 0;
        if (numberArray != null) {
            numberArrayLength = numberArray.length;
        }
        int[] newNumArray = new int[numberArrayLength + 1];
        int newNumArrayLength = newNumArray.length;
        for (int i = 0; i < newNumArrayLength - 1; i++) {
            newNumArray[i] = numberArray[i];
        }
        newNumArray[newNumArrayLength - 1] = number;
        numberArray = newNumArray;
    }

    public void pop() {
        int[] newNumArray = new int[numberArray.length - 1];
        int newNumArrayLength = newNumArray.length;
        for (int i = 0; i < newNumArrayLength - 1; i++) {
            newNumArray[i] = numberArray[i];
        }
        numberArray = newNumArray;
    }

    public boolean empty() {
        return numberArray.length == 0;
    }

    public void clear() {
        numberArray = null;
    }

    public void print() {
        System.out.print("[");

        if (numberArray != null) {
            int numArrayLength = numberArray.length;
            for (int i = 0; i < numArrayLength; i++) {
                if (i <= numArrayLength-2) {
                    System.out.print(numberArray[i] + ",");
                } else {
                    System.out.print(numberArray[i]);
                }
            }
        }
        System.out.println("]");
    }

    public boolean contains(int num) {
        int numArrayLength = numberArray.length;

        if (numArrayLength > 0) {
            for (int number : numberArray
            ) {
                if (num == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public int peek() {
        int numArrayLength = numberArray.length;

        return numberArray[numArrayLength - 1];
    }


}
