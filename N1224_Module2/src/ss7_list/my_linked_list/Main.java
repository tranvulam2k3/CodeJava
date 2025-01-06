package ss7_list.my_linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //a. addFirst(int element)
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);

        //b. toString()
        System.out.println("Danh sách ban đầu: " + myLinkedList.toString());

        //c. addLast(int element)
        myLinkedList.addLast(40);
        myLinkedList.addLast(50);

        //d. add(int index, int element)
        myLinkedList.add(2, 25);
        System.out.println("Danh sách sau khi thêm 25 vào vị trí thứ 2: " + myLinkedList.toString());

        //e. removeFirst()
        myLinkedList.removeFirst();
        System.out.println("Danh sách sau khi xóa phần tử đầu tiền: " + myLinkedList.toString());

        //f. removeLast()
        myLinkedList.removeLast();
        System.out.println("Danh sách sau khi xóa phần tử cuối cùng: " + myLinkedList.toString());

        //g. remove(int index)
        myLinkedList.remove(4);
        System.out.println("Danh sách sau khi xóa phần tử ở vị trí thứ 4: " + myLinkedList.toString());

        //h. getFirst()
        Integer firstElement = myLinkedList.getFirst();
        System.out.println("Phần tử đầu tiên trong danh sách: " + firstElement);

        //i.getLast()
        Integer lastElement = myLinkedList.getLast();
        System.out.println("Phần tử cuối cùng trong danh sách: " + lastElement);

        //j. get(int index)
        Integer elementAtIndex = myLinkedList.get(3);
        System.out.println("Phần tử thứ 3 trong danh sách: " + elementAtIndex);

        //k. set(int index , int element)
        myLinkedList.set(3, 11);
        System.out.println("Danh sách sau khi thay đổi phần tử thứ 3 thành 11: " + myLinkedList.toString());

        //l. indexOf(int element)
        Integer indexOfElement = myLinkedList.indexOf(20);
        System.out.println("Vị trí index của phần tử 20 là: " + indexOfElement);

        //m. lastIndexOf(int element)
        Integer lastIndexOfElement = myLinkedList.lastIndexOf(20);
        System.out.println("Vị trí index cuối cùng của phần tử 20 là: " + lastIndexOfElement);
    }
}
