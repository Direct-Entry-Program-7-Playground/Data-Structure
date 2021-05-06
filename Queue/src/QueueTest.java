import ds.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println(queue.size());
        System.out.println(queue.empty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());

        queue.dequeue();

        System.out.println(queue.size());
        System.out.println(queue.empty());
        System.out.println(queue.peek());
        queue.print();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println(queue.contains(30));
        System.out.println(queue.contains(50));
        System.out.println(queue.contains(25));

        queue.clear();

        System.out.println(queue.size());
        System.out.println(queue.empty());
        System.out.println(queue.peek());
        queue.print();

        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);

        System.out.println(queue.size());
        System.out.println(queue.empty());
        System.out.println(queue.peek());
        queue.print();
    }
}
