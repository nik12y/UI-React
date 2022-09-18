package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import net.minidev.json.JSONObject;
import org.json.JSONArray;

import java.util.Arrays;

public class JsonAddElement {
    public static void main(String[] args) {
        JSONObject jsonObject=new JSONObject();

        jsonObject.appendField("contact number", Arrays.asList("461131","69488",Arrays.asList("name","raju"),"9774941"));
        jsonObject.appendField("name","nikhil");
        jsonObject.appendField("age",45);
        Gson gson=new Gson();
        JSONArray array=new JSONArray();
        array.put("e-mail: krishna_kasyap@gmail.com");
        array.put("phone: 9848022338");
        array.put("city: Hyderabad");
        array.put("Area: Madapur");
        array.put("State: Telangana");
        JsonElement jsonElement =gson.toJsonTree(jsonObject);
        jsonElement.getAsJsonObject().addProperty("Address", String.valueOf(array));

        String jsonstr=gson.toJson(jsonElement);

        System.out.println(jsonstr);
    }
}
