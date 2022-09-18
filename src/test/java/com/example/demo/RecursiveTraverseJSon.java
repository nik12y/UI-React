package com.example.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecursiveTraverseJSon {
    public static void main(String[] args) throws JSONException {
        String jsonString = "[{\"text\":\"Millions\", \"children\":[{\"text\":\"Dinosaur\", \"children\":[{\"text\":\"Stego\"}]}, {\"text\":\"Dinosaur\", \"children\": [{\"text\":\"T-REX\"}]}]}]";
        JSONArray jsonArray = new JSONArray(jsonString);
        System.out.println(jsonString);
        addChecked(jsonArray);
        System.out.println(jsonArray);
    }

    public static void addChecked(JSONArray ja) throws JSONException {

        for (int i = 0; i < ja.length(); i++) {
            JSONObject jo = (JSONObject) ja.get(i);
            if (jo.has("children"))
                addChecked((JSONArray) jo.get("children"));
            JSONArray array = new JSONArray();
            array.put("e-mail: krishna_kasyap@gmail.com");
            array.put("phone: 9848022338");
            array.put("city: Hyderabad");
            array.put("Area: Madapur");
            array.put("State: Telangana");
            jo.put("child", array);
        }
    }
}
