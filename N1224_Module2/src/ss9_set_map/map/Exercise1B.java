package ss9_set_map.map;

import java.util.*;

public class Exercise1B {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Lam", "Thuan", "Thuan", "Duy", "Thuan", "Duy", "Duy");

        Map<String, Integer> nameCount = new HashMap<>();

        for (String s : name) {
            nameCount.put(s, nameCount.getOrDefault(s, 0) + 1);
        }

        System.out.println("Ten duy nhat: ");
        for (String s : nameCount.keySet()) {
            if (nameCount.get(s) == 1) {
                System.out.println(s);
            }
        }

        System.out.println("Ten xuat hien nhieu lan");
        for (String s : nameCount.keySet()) {
            if (nameCount.get(s) > 1) {
                System.out.println(s + " xuat hien " + nameCount.get(s) + " lan");
            }
        }
    }
}