import collection.MyArrayList;
import collection.MyLinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>(30000);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        byte[] ar = new byte[3]; // @10

        // ArrayList add
        long startTime = System.nanoTime();
        for (int i = 0; i < 30_000; i++) {
            myArrayList.add(i);
        }
        long endTime = System.nanoTime();

        System.out.println("ArrayList add: " + (endTime - startTime));

        // LinkedList add
        startTime = System.nanoTime();
        for (int i = 0; i < 30_000; i++) {
            myLinkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add: " + (endTime - startTime));

        // Arraylist get
        startTime = System.nanoTime();
        for (int i = 0; i < myArrayList.size(); i++) {
            myArrayList.get(i);
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList get: " + (endTime - startTime));

        // LinkedList get
        startTime = System.nanoTime();
        for (int i = 0; i < myLinkedList.size(); i++) {
            myLinkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList get: " + (endTime - startTime));

        System.out.println("Index of 5: " + myLinkedList.indexOf(29999));

    }
}