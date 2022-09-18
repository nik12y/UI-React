package com.example.demo;

import org.checkerframework.checker.units.qual.A;

import java.util.*;

public class ArrayListPrint {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //simple java code to print ArrayList<>();
        printArrayList(list);
        System.out.println("List of Fruits :" + list);
        //simple java code to print ArrayList<>() using forEach Loop;
//        printListUsingForEach(list);
//        //simple java code to print ArrayList<>() using Iterator;
//        printListUsingIterator(list);
//        System.out.println("List of Fruits :" + list);
    }

    private static void printArrayList(List<String> list) {
        list.add("Mango");
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grabs");

        //this is for sorting an array
        Collections.sort(list);

     //   System.out.println("List of Fruits :" + list);
    }
    //print using forEach
    private static void printListUsingForEach(List<String> list1){
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");
        list1.add("Grabs");
        for(String each: list1){
            System.out.println("Each element using forEach :"+each);
        }
    }
    //print using Iterator
    private static void printListUsingIterator(List<String> list2){
        list2.add("Mango");
        list2.add("Apple");
        list2.add("Orange");
        list2.add("Banana");
        list2.add("Grabs");
        Iterator it=list2.iterator();
        while (it.hasNext()){
            System.out.println("list of Fruits Using Iterator :"+it.next());
        }
    }

}
