package CollectionsDemo;

import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(24);
        pq.offer(14);
        pq.offer(34);
        pq.offer(21);
        pq.offer(64);
        pq.offer(27);

        System.out.println(pq); // 14, 21, 24, 27, 34, 64

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
