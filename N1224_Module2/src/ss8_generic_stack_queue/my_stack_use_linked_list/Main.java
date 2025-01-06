package ss8_generic_stack_queue.my_stack_use_linked_list;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        //a. push()
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Ngăn xếp: " + myStack.toString());

        //b. peek()
        Integer peekValue = myStack.peek();
        System.out.println("Giá trị ở đầu ngăn xếp: " + peekValue);

        //c. pop()
        Integer popValue = myStack.pop();
        System.out.println("Giá trị lấy ra: " + popValue);

        //d. isEmpty()
        boolean empty = myStack.isEmpty();
        System.out.println("Ngăn xếp có trống không: " + empty);

        //e. size()
        int stackSize = myStack.size();
        System.out.println("Kích thước ngăn xếp: " + stackSize);
    }
}
