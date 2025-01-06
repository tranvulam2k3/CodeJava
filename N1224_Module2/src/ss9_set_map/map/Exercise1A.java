package ss9_set_map.map;

import java.util.*;

public class Exercise1A {
    public static void main(String[] args) {
        String str = "Thai Hoang Bao Bao Hoang Thai Thai Bao";

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = str.split(" ");
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}