package ss8_generic_stack_queue.my_stack_use_array;


public class MyStack<E> {
    private int capacity;
    private Object[] arr;
    private int size;
    private Object[] emptyArray = {};

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
    }

    public MyStack() {
        arr = emptyArray;
    }

    //a. push()
    public void push(E value) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new Object[capacity];
        }
        if (arr.length == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            Object[] newArr = new Object[capacity];

            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
                arr = newArr;
            }
            arr[size] = value;
            size++;
        }
    }

    //b.peek()
    public E peek() {
        if (size == 0) {
            System.out.println("Ngăn xếp rỗng, không thể lấy ra");
            return null;
        }
        return (E) arr[size - 1];
    }

    //c.pop()
    public E pop() {
        if (size == 0) {
            System.out.println("Ngăn xếp rỗng, không thể lấy ra");
            return null;
        }
        E element = (E) arr[size - 1];
        arr[size - 1] = null;
        size--;
        return element;
    }

    //d. isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    //e. size()
    public int size() {
        return size;
    }

    //toString()
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }
}
