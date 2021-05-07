import ds2.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.enqueueRear(11);
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        System.out.println(deque.contains(30));
        deque.print();

        deque.enqueueRear(12);
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        System.out.println(deque.contains(30));
        deque.print();

        deque.enqueueRear(13);
        deque.enqueueRear(14);
        deque.enqueueRear(15);
        deque.enqueue(10);
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        System.out.println(deque.contains(30));
        deque.print();

        deque.dequeueFront();
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        System.out.println(deque.contains(30));
        deque.print();

        deque.dequeue();
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        System.out.println(deque.contains(30));
        deque.print();
        deque.clear();


    }
}