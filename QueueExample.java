import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(60);

        System.out.println(pq);

        pq.offer(70);
        System.out.println(pq);

        System.out.println(pq.element());

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq.remove());

        System.out.println(pq.poll());
    }
}
