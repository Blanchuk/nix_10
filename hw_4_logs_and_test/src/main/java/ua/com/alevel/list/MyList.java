package ua.com.alevel.list;

import java.util.Arrays;

public class MyList<T> {

    private int size;

    private Object[] array;

    public MyList() {
        size = 0;
        array = new Object[16];
    }

    public void add(T num) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = num;
        size++;
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
    }

    public T get(int index) {
        return (T) array[index];
    }

    public int getSize() {
        return size;
    }
}
