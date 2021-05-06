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
            for (int i = numArrayLength-1; i >= 0; i--) {
                if (i >=  1) {
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

    public static void main(String[] args) {// to Checking purpose only
        Stack s = new Stack();
        s.print();

        s.push(10);
        s.size();

        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.size();

        s.print();
        s.pop();
        s.print();
        s.size();
        System.out.println(s.peek());
        System.out.println(s.contains(60));
    }

    private void size() {
        System.out.println(numberArray.length);
    }
}
