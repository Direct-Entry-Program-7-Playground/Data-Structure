package ds;

public class Queue {
    int[] queueArray;

    public void enqueue(int number) {
        if (queueArray == null) {
            queueArray = new int[1];
            queueArray[0] = number;
        } else {
            int queueArrayLength = queueArray.length;
            int[] newQueueArray = new int[queueArrayLength + 1];
            for (int i = 0; i < queueArrayLength; i++) {
                newQueueArray[i] = queueArray[i];
            }
            newQueueArray[queueArrayLength] = number;
            queueArray = newQueueArray;
        }
    }

    public void dequeue() {

    }

    public boolean empty() {
        return (queueArray == null) || (queueArray.length == 0);
    }

    public int peek() {
        return 0;
    }

    public void clear() {
        if (queueArray != null) {
            queueArray = null;
        }
    }

    public void print() {

    }

    public boolean contains(int number) {
        return false;
    }

    public int size() {
        return queueArray != null ? queueArray.length : 0;
    }
}
