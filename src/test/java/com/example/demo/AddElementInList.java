package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddElementInList {
    public static void main(String[] args) {
        List<String> str=new ArrayList<>();
        str.add("Red");
        str.add("Green");
        System.out.println("str :"+str);
        str.add(1,"Mango");
        System.out.println("After adding :"+str);
        System.out.println(str.containsAll(List.of(str)));
        System.out.println("Index of : "+ str.indexOf("Mango"));

        str.add("Orange");
        for(String element:str){
            System.out.println("Using for Each loop :"+element);
        }
        System.out.println("After Iterating the list");
        Iterator it= str.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("List ---->>>:"+str);
        //retrieve the element from list
        System.out.println(str.get(1));//rite a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(str.set(1,"Blue"));//Write a Java program to update specific array element by given element
        System.out.println(str);
        System.out.println(str.get(3));//rite a Java program to retrieve an element (at a specified index) from a given array list
        System.out.println(str.subList(1,4));
        System.out.println(str.remove(3));//Write a Java program to remove the third element from a array list.

        if(str.contains("Red")) {
            System.out.println("True");
        }else {
            System.out.println("false");
        }
    }
}
