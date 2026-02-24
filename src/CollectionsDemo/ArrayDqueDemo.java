package CollectionsDemo;

import java.util.ArrayDeque;

public class ArrayDqueDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(24);
        adq.offer(14);
        adq.offer(34);
        adq.offer(21);
        adq.offer(64);
        adq.offer(27);
        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);


    }
}
