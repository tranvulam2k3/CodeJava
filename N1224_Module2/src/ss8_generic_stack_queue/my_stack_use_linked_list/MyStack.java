package ss8_generic_stack_queue.my_stack_use_linked_list;


public class MyStack<E> {
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

    //a. push()
    public void push(E value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b.peek()
    public E peek(){
        if (head == null) {
            return null;
        }
        return head.value;
    }

    //c.pop()
    public E pop() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;
        }else {
            head = head.next;
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

    //toString()
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
