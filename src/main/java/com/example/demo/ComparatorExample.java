package com.example.demo;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorExample {
    public static void main(String[] args) {
//        TreeMap<String,String> tree_map1 = new TreeMap<String,String>(new sort_key());
//        // Put elements to the map
//        tree_map1.put("C2", "Red");
//        tree_map1.put("C4", "Green");
//        tree_map1.put("C2", "Black");
//        tree_map1.put("C1", "White");
//        System.out.println(tree_map1);
//    }
//}
//class sort_key implements Comparator<String> {
//    @Override
//    public int compare(String str1, String str2) {
//        return str1.compareTo(str2);
//    }
        TreeMap<String,String> map=new TreeMap<>(new comapareKey());
         map.put("C4","Neem");
         map.put("C7","Gulab");
         map.put("C5","Honey");
         map.put("C6","Rose");
        System.out.println("map :"+map);

    }
}
class comapareKey implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        return o1.compareTo(o2);
    }
}