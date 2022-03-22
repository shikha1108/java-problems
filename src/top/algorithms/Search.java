package top.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        Boolean result = search(fruits, "banana");
        System.out.println(result);
    }

    private static Boolean search(List<String> strs, String key) {
        Boolean exists = false;
        for (String s : strs) {
            if (s.equals(key)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
}
