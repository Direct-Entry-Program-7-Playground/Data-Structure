public class Stack {
    private int[] numberArray;
    private int numArrayLength = numberArray.length;

    public void push(int number) {
        int[] newNumArray = new int[numArrayLength + 1];
        numberArray[numArrayLength + 1] = number;
        numberArray = newNumArray;
        numArrayLength = newNumArray.length;
    }

    public void pop() {
        int[] newNumArray = new int[numArrayLength - 1];
        int newNumArrayLength = newNumArray.length;
        for (int i = 0; i < newNumArrayLength; i++) {
            newNumArray[i] = numberArray[i];
        }
        numberArray = newNumArray;
    }

}
