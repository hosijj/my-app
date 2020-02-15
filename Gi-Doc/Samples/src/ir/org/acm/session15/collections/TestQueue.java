package ir.org.acm.session15.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList();

        q.offer("1"); // Inserts the specified element into this queue
        q.offer("2");
        q.offer("3");

        String first = q.poll(); // Retrieves and removes the head of this queue
        System.out.println(first);

        String second = q.poll();
        System.out.println(second);

    }

}
