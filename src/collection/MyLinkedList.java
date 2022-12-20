package collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyLinkedList<E> extends AbstractList<E> implements Deque<E> {

    private Node<E> head;
    private Node<E> tail;

    private int size;

    public MyLinkedList() {

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<E> currentNode = head; //
        for (int i = 1; i <= index; i++) { // i = 1
            currentNode = currentNode.next; //
        }
        return currentNode.element;
    }

    @Override
    public int indexOf(E element) {
        Node<E> currentNode = head;

        for (int i = 0; i < size(); i++) {
            if (currentNode.element.equals(element)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
        int lastIndex = -1;

        Node<E> currentNode = head;

        for (int i = 0; i < size(); i++) {
            if (currentNode.element.equals(element)) {
                lastIndex = i;
            }
            currentNode = currentNode.next;
        }
        return lastIndex;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        if (index == 0) {
            pollFirst();
        } else if (index == size() - 1) {
            pollLast();
        }
        else {
            Node<E> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.next;
            }

            Node<E> removed = previous.next;
            previous.next = removed.next;
            size--;
            return removed.element;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= size) {
            addLast(element);
        } else {
            Node<E> currentNode = head;

            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }

            Node<E> newNode = new Node<>(element);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        if (indexOf((E) o) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
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
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("head -> ");

        Node<E> currentNode = head;

        for (int i = 0; i < size(); i++) {
            result.append(currentNode.element);
            currentNode = currentNode.next;
            if (currentNode != null) {
                result.append(" -> ");
            } else {
                result.append(" <- tail");
            }
        }
        return result.toString();
    }

    @Override
    public void addFirst(E e) {
        offerFirst(e);
    }

    @Override
    public void addLast(E e) {
        offerLast(e);
    }

    @Override
    public boolean offerFirst(E e) {
        int prevSize = size;
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;

        return prevSize != size;
    }

    @Override
    public boolean offerLast(E e) {
        int prevSize = size;
        Node<E> newNode = new Node<>(e);
        if (tail == null) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return prevSize != size;
    }

    @Override
    public E removeFirst() {
        return null; // hw
    }

    @Override
    public E removeLast() {
        return null; // hw
    }

    @Override
    public E pollFirst() {
        if (size == 0) {
            return null;
        } else {
            Node<E> tempNode = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            tempNode.next = null;
            return tempNode.element;
        }
    }

    @Override
    public E pollLast() {
        // hw
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return add(e);
    }

    @Override
    public E remove() {
        E e = poll(); // Tashkent
        if (e == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return e;
    }

    @Override
    public E poll() {
        return remove(0); // Tashkent
    }

    @Override
    public E element() {
        E e = peek();
        if (e == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return e;
    }

    @Override
    public E peek() {
        return get(0);
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    private static class Node<E> {

        E element; // содержимое узла e = Tashkent
        Node<E> next; // ссылка на следующий узел

        public Node(E element) {
            this.element = element;
        }
    }
}
