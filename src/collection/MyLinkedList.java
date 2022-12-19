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

        for (int i = 0; i < size; i++) {
           if (currentNode.element.equals(element)) {
               lastIndex = i;
           }
           currentNode = currentNode.next;
        }
        return lastIndex;
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

            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
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

    private static class Node<E> {

        E element; // содержимое узла e = Tashkent
        Node<E> next; // ссылка на следующий узел

        public Node(E element) {
            this.element = element;
        }
    }
}
