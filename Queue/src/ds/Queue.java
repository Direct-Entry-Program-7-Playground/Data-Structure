package ds;

public class Queue {
    int queueArray[];

    public void enqueue(int number) {

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
