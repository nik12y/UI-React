package com.example.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class AddElementInArrayList {
    public static void main(String[] args) throws JSONException {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object
        jsonObject.put("ID", "1");
        jsonObject.put("First_Name", "Krishna Kasyap");
        jsonObject.put("Last_Name", "Bhagavatula");
        jsonObject.put("Date_Of_Birth", "1989-09-26");
        jsonObject.put("Place_Of_Birth", "Vishakhapatnam");
        jsonObject.put("Country", "25000");
        //Creating a json array
        JSONArray array = new JSONArray();
        array.put("e-mail: krishna_kasyap@gmail.com");
        array.put("phone: 9848022338");
        array.put("city: Hyderabad");
        array.put("Area: Madapur");
        array.put("State: Telangana");
        //Adding array to the json object
        jsonObject.put("contact",array);
        try {
            FileWriter file = new FileWriter("D:/json_array_output.json");
            file.write(jsonObject.toString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}
 /*       ArrayList<String> a1=new ArrayList<>();
        a1.add("Ravi");
        a1.add("Kumar");
        a1.add("Mohan");
        Collections.sort(a1);
        System.out.println("After invoking the Element in list \n:"+a1);

        //Now Adding an element in a1 list
        ArrayList<String> a2=new ArrayList<>();
        a2.add("Rajesh");
        a2.add("Kiran");
        //sort the elements

        a1.addAll(1,a2);
        Collections.sort(a1);

        System.out.println("After invoking the element in the a1 from a2 :"+a1);

        //Now adding an element of a3 in a1 list
        ArrayList<String> a3=new ArrayList<>();
        a3.add("Abhijeet");
        a3.add("Rohan");

        a1.addAll(2,a3);
        Collections.sort(a1);
        System.out.println("After invoking the element of a3 in a1 :"+a1);

*/
