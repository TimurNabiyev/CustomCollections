package collection;

import java.util.Collection;

public interface MyList<E> extends Collection<E> {

    E get(int index);
    int indexOf(E element);
    int lastIndexOf(E element);
    E remove(int index);

}
