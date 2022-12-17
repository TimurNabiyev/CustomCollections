package collection;

import java.util.Iterator;

public class MyLinkedList<E> extends AbstractList<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public MyLinkedList() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public int lastIndexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element);

        if (index == 0) {
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = head;
            }
        } else if (index >= size) {
            if (tail == null) {
                tail = head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        } else {
            Node<E> currentNode = head;

            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public void clear() {

    }

    private static class Node<E> {

        E element; // содержимое узла e = Tashkent
        Node<E> next; // ссылка на следующий узел

        public Node(E element) {
            this.element = element;
        }
    }
}
