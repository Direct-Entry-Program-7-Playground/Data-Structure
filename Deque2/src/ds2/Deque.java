package ds2;

import ds.Queue;

public class Deque extends Queue {
    public void enqueueRear(int number) {
        if (this.empty()) {
            queueArray = new int[1];
            queueArray[0] = number;
        } else {
            int queueArrayLength = queueArray.length;
            int[] newQueueArray = new int[queueArrayLength + 1];
            int newQueueArrayLength = newQueueArray.length;
            newQueueArray[0] = number;
            for (int i = 1; i < newQueueArrayLength; i++) {
                newQueueArray[i] = queueArray[i - 1];
            }
            queueArray = newQueueArray;
        }
    }

    public void dequeueFront() {
        if (!this.empty()) {
            int queueArrayLength = queueArray.length;
            int[] newQueueArray = new int[queueArrayLength - 1];
            int newQueueArrayLength = newQueueArray.length;
            for (int i = 0; i < newQueueArrayLength; i++) {
                newQueueArray[i] = queueArray[i ];
            }
            queueArray = newQueueArray;
        } else {
            System.out.println("Empty queue, nothing to remove!");
        }
    }
}