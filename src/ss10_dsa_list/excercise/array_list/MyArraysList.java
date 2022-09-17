package ss10_dsa_list.excercise.array_list;

import java.util.Arrays;

public class MyArraysList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArraysList() {
        elements = new Object [DEFAULT_CAPACITY];
    }

    public MyArraysList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        Arrays.fill(elements, null);
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E element) {
        if (elements.length == size) {
            ensureCapacity();
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity();
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        }

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }


        }
        return index;

    }
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }
    public MyArraysList<E> clone(){
        MyArraysList<E> v = new MyArraysList<>();
        v.elements = Arrays.copyOf(this.elements,this.size);
        v.size = this.size;
        return v;
    }
    public E remove(int index){
        if(index<0 || index >elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element = (E) elements[index];
        for(int i = index;i<size -1;i++){
            elements[i] = elements[i+1];
        }
        elements[size -1] = null;
        size--;
        return element;
    }}





