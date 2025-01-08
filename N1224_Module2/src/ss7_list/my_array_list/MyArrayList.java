package ss7_list.my_array_list;

public class MyArrayList {
    private int capacity;
    private int size;
    private int[] arr;
    private int[] emptyArray = {};


    public int size() {
        return size;
    }

    public MyArrayList() {
        arr = emptyArray;
    }

    //a. add
    public void add(int element) {
        if (arr == emptyArray) {
            this.capacity = 10;
            this.arr = new int[this.capacity];
        }
        if (size == this.capacity) {
            this.capacity *= 1.5;
            if (size == this.capacity) {
                capacity++;
            }

            int[] brr = new int[this.capacity];
            for (int i = 0; i < size; i++) {
                brr[i] = arr[i];
            }
        }
        arr[size] = element;
        size++;
    }

    //b. ToString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append("\t");
        }
        return sb.toString();
    }

    //c. add(int index , int element)
    public void addFromIndexToElement(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        if (size == this.capacity) {
            this.capacity *= 1.5;
            if (size == this.capacity) {
                capacity++;
            }

            int[] brr = new int[this.capacity];

            for (int i = 0; i < index; i++) {
                brr[i] = arr[i];
            }

            brr[index] = element;

            for (int i = index; i < size; i++) {
                brr[i + 1] = arr[i];
            }

            arr = brr;
        } else {
            for (int i = size; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
        }
        size++;
    }

    //d. set(int index , int element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        arr[index] = element;
    }

    //e. get(int index)
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return null;
        }
        return arr[index];
    }

    //f. indexOf(int element)
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //g. lastIndexOf(int element)
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //h. remove(int index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    //i. removeElement (int element)
    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != element) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }
        size = newIndex;
    }

}
