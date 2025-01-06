package ss7_list.my_array_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        //a. add
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(10);
        myArrayList.add(20);

        //b. ToString
        System.out.println("Danh sách ban đầu: " + myArrayList.toString());

        //c. add(int index , int element)
        myArrayList.addFromIndexToElement(2, 25);
        System.out.println("Danh sách sau khi thay thế: " + myArrayList.toString());

        //d. set(int index , int element)
        myArrayList.set(3, 55);
        System.out.println("Danh sách sau khi thay thế: " + myArrayList.toString());

        //e. get(int index)
        int elementAtIndex = myArrayList.get(5);
        System.out.println("Phần tử tại vị trí thứ 5 là: " + elementAtIndex);

        //f. indexOf(int element)
        int elementToFind = 30;
        int indexToFind = myArrayList.indexOf(elementToFind);
        if (indexToFind != -1) {
            System.out.println("Vị trí index của phần tử " + elementToFind + " là: " + indexToFind);
        } else {
            System.out.println("Không tìm thấy phần từ: " + elementToFind + " trong danh sách");
        }

        //g. lastIndexOf(int element)
        int LastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (LastIndexOfElement != -1) {
            System.out.println("Vị trí index của phần tử " + elementToFind + " là: " + LastIndexOfElement);
        } else {
            System.out.println("Không tìm thấy phần từ: " + elementToFind + " trong danh sách");
        }

        //h. remove(int index)
        myArrayList.remove(1);
        System.out.println("Danh sách sau khi xóa ở vị trí thứ 1: " + myArrayList.toString());

        //i. removeElement (int element)
        myArrayList.removeElement(30);
        System.out.println("Danh sách sau khi xóa tất cả các phần tử có giá trị 30: " + myArrayList.toString());

    }
}
