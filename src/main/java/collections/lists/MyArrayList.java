package collections.lists;

import java.util.*;

public class MyArrayList implements List {
    private Object[] values;
    private int size;

    public MyArrayList() {
        this.values = new Object[4];
    }

    /*
      Stwórz klasę MyArrayList, zaimplementuj interfejs List oraz jego metody:
      add(E e), set(int index, E e) remove(E e), get(E e), size(), isEmpty(), contains(E element).
       Do każdej z metod napisz testy jednostkowe.
       */

    @Override
    public boolean add(Object o) {

        if (values[values.length - 1] != null) {
            Object[] objects = new Object[values.length * 2];
            for (int i = 0; i < values.length; i++) {
                objects[i] = values[i];
            }
            values = objects;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                values[i] = o;
                size++;
                return true;
            }
        }
        return false;
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
        return indexOf(o) != -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object get(int index) {
        return values[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        Object value = values[index];
        values[index] = null;
            for (int i = index; i < values.length - 1; i++) {
            values[i] = values[i + 1];

        }

        size--;
        return value;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }


    @Override
    public String toString() {
        return "MyArrayList{" + "object=" + Arrays.toString(values) + '}';
    }
}
