import java.util.Arrays;

public class Stack {
    private int[] numberArray;
    private int numArrayLength = numberArray.length;

    public void push(int number) {
        int[] newNumArray = new int[numArrayLength + 1];
        int newNumArrayLength = newNumArray.length;
        for (int i = 0; i < newNumArrayLength - 1; i++) {
            newNumArray[i] = numberArray[i];
        }
        newNumArray[newNumArrayLength - 1] = number;
        numberArray = newNumArray;
        numArrayLength = newNumArrayLength;
    }

    public void pop() {
        int[] newNumArray = new int[numArrayLength - 1];
        int newNumArrayLength = newNumArray.length;
        for (int i = 0; i < newNumArrayLength - 1; i++) {
            newNumArray[i] = numberArray[i];
        }
        numberArray = newNumArray;
        numArrayLength = newNumArrayLength;
    }

    public boolean empty() {
        return numberArray.length == 0;
    }

    public void clear() {
        numberArray = null;
    }

    public void print() {
        System.out.print("[");

        if (numberArray.length > 0) {
            for (int i = 0; i < numArrayLength - 1; i++) {
                if (i <= numArrayLength - 2) {
                    System.out.print(numberArray[i] + ",");
                } else {
                    System.out.print(numberArray[i]);
                }
            }
        }
        System.out.print("]");
    }

    public boolean contains(int num) {
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
        return numberArray[numArrayLength - 1];
    }
}
