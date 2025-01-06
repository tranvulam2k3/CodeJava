package ss9_set_map.set;

import java.util.HashSet;

public class Exercise1C {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 2, 7, 5, 7, 1, 0, 3};
        int[] arr2 = {1, 6, 4, 9, 0, 3, 5, 7, 8, 2};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        HashSet<Integer> commontElements = new HashSet<>(set1);
        commontElements.retainAll(set2);

        System.out.println("Cac phan tu giong nhau o 2 mang: ");
        for (int i : commontElements) {
            System.out.print(i + " ");
        }
    }
}