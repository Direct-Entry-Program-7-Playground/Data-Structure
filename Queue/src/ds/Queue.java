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
        if (!(queueArray == null) || !(queueArray.length == 0)) {
            int queueArrayLength = queueArray.length;
            int[] newQueueArray = new int[queueArrayLength - 1];
            for (int i = 0; i < queueArrayLength - 1; i++) {
                newQueueArray[i] = queueArray[i];
            }
            queueArray = newQueueArray;
        } else {
            System.out.println("Empty queue, nothing to remove!");
        }
    }

    public boolean empty() {
        return (queueArray == null) || (queueArray.length == 0);
    }

    public int peek() {
        if (!(queueArray == null) && !(queueArray.length == 0)) {
            int queueArrayLength = queueArray.length;
            return queueArray[queueArrayLength - 1];
        }
        return 0;
    }

    public void clear() {
        if (queueArray != null) {
            queueArray = null;
        }
    }

    public void print() {
        System.out.print("[");
        if (!(queueArray == null) && !(queueArray.length == 0)) {
            int queueArrayLength = queueArray.length;

            for (int i = 0; i < queueArrayLength; i++) {
                if (i != (queueArrayLength - 1)) {
                    System.out.print(queueArray[queueArrayLength - 1 - i] + ",");
                } else {
                    System.out.print(queueArray[queueArrayLength - 1 - i]);
                }
            }
        }
        System.out.println("]");
    }

    public boolean contains(int number) {
        if (!(queueArray == null) && !(queueArray.length == 0)) {
            for (int num :
                    queueArray) {
                if (num == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return queueArray != null ? queueArray.length : 0;
    }
}
