package final_test;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        inputArray(arr , n);
        System.out.println(sortArray(arr));
        System.out.println(getMax(arr));
        System.out.println(dem(arr));

    }

    static void inputArray(ArrayList<Integer> list, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử mảng [%d]: ", i);
            list.add(scanner.nextInt());
        }
    }


    static ArrayList<Integer> sortArray(ArrayList<Integer> arr){
        Collections.sort(arr);
        return arr;
    }

    static int getMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max ;
    }

    static int dem(ArrayList<Integer> arr){
        int temp = 0;
        for(int i : arr){
            if(i == getMax(arr)){
                temp++;
            }
        }
        return temp;
    }

}
