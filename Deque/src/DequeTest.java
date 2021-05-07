import ds.Deque;

public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new Deque();

        System.out.println(deque.size());
        System.out.println(deque.empty());

        deque.enqueue(10);
        deque.enqueueRear(15);
        deque.enqueueRear(25);

        deque.enqueue(20);
        deque.enqueue(30);

        System.out.println(deque.peek());

    /*    deque.dequeue();
        deque.dequeue();
        deque.dequeue();
        deque.dequeue();
        deque.dequeue();*/

        System.out.println(deque.size());
        System.out.println(deque.empty());
//        System.out.println(deque.peek());
        deque.print();

        deque.enqueue(40);
        deque.enqueue(50);
        deque.enqueue(60);

        System.out.println(deque.contains(30));
        System.out.println(deque.contains(50));
        System.out.println(deque.contains(25));

        deque.clear();

        System.out.println(deque.size());
        System.out.println(deque.empty());
//        System.out.println(deque.peek());
        deque.print();

        deque.enqueue(70);
        deque.enqueue(80);
        deque.enqueue(90);
        deque.enqueue(100);

        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        deque.print();

        deque.dequeueFront();
        System.out.println(deque.size());
        System.out.println(deque.empty());
        System.out.println(deque.peek());
        deque.print();
    }
}
