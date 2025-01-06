package ss8_generic_stack_queue.my_queue;

public class MyQueue<E> {
    private class Node {
        private E value;
        private Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //a. add()
    public void add(E value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //b. peek()
    public E peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }


    //c. pool()
    public E poll() {
        if (head == null) {
            return null;
        }

        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            for (int i = 2; i < size; i++) {
                temp = temp.next;
            }

            tail = temp;
            temp = temp.next;
            tail.next = null;
        }
        size--;
        return temp.value;
    }

    //d. isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    //e. size()
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            sb.append(temp.value);
            if (temp.next != null) {
                sb.append(" -> ");
            }
            temp = temp.next;
        }
        return sb.toString();
    }
}