public class Stack {
    private int[] numberArray;
    private int numArrayLength = numberArray.length;

    public void push(int number) {
        int[] newNumArray = new int[numArrayLength + 1];
        numberArray[numArrayLength + 1] = number;
        numberArray = newNumArray;
    }


}
