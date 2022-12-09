package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int size; // 1

    public MyArrayList() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        ensureCapacity();
        int prevSize = size;
        data[size++] = element;
        return prevSize != size;
    }

    @Override
    public boolean remove(Object o) {
        int index = indexOf((E) o);

        E removed = null;
        if (index != -1) {
            removed = remove(index);
        }
        return removed != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(int index, E element) { // index = 1 element = 74547
        check(index);
        ensureCapacity();
        for (int i = size() - 1; i >= index; i--) { // data = {1, 74547, 7, 8, 96, 0} size = 5 length = 6 i = 1
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    @Override
    public E get(int index) {
        checkRange(index);
        return data[index];
    }

    @Override
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (data[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(E element) {
        int index = -1;
        for (int i = size() - 1; i >= 0; i--) {
            if (data[i].equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public E remove(int index) {
        checkRange(index);
        E elementToRemove = data[index];

        for (int i = index; i + 1 < size; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;

        return elementToRemove;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean isPresent = false;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public void trimToSize() {
        if (data.length == size) {
            return;
        }

        size = Math.max(size, DEFAULT_CAPACITY);

        data = Arrays.copyOf(data, size);

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

    private void ensureCapacity() {
        if (size() >= data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("For index=" + index + " size=" + size());
        }
    }

    private void check(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("For index=" + index + " size=" + size());
        }
    }

}
