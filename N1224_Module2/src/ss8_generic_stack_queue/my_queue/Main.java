package ss8_generic_stack_queue.my_queue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);

        System.out.println("Hàng đợi: " + myQueue.toString());

        Integer peekValue = myQueue.peek();
        System.out.println("Vị trí đầu hàng đợi: " + peekValue);

        Integer pollValue = myQueue.poll();
        System.out.println("Giá trị lấy ra: " + pollValue);

        boolean isEmpty = myQueue.isEmpty();
        System.out.println("Hàng đợi có trống không: " + isEmpty);

        int queueSize = myQueue.size();
        System.out.println("Kích thước hàng đợi: " + queueSize);
    }
}
