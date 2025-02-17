import collection.MyArrayList;
import collection.MyLinkedList;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Deque<String> linkedList = new LinkedList<>();

        linkedList.addFirst("A");
        linkedList.offerFirst("B");
        linkedList.offer("C");
        Deque<String> deque = new LinkedList();
        deque.add("First");
        deque.add("Second");
        deque.removeFirst();

        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
    }
}