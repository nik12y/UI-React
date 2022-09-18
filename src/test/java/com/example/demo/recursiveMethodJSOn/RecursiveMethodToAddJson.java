package com.example.demo.recursiveMethodJSOn;

import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class RecursiveMethodToAddJson {
    public static void main(String[] args) throws JSONException {

        JSONObject outerObject = new JSONObject();
        JSONArray outerArray = new JSONArray();
        JSONObject innerObject = new JSONObject();
        JSONObject innerInObject = new JSONObject();
        JSONArray innerArray = new JSONArray();


        innerInObject.put("entity_code", "BU01");
        innerInObject.put("entity_desc", "Dummy Home finance");
        innerInObject.put("entity_name", "Dummy Home finance");
        innerInObject.put("entity_type", "BU");
//
        innerObject.put("entity_desc","Dummy Retail market entity");
        innerObject.put( "entity_type","MKE");
//
        innerObject.put( "entity_code","MKE01");
        innerObject.put( "entity_name","Dummy Retail market entity");
        innerArray.put(innerInObject);

        //adding aaray to object
        innerObject.put("children", innerArray);

        outerArray.put(innerObject);

        //adding outerArray to outerObject
        outerObject.put("Children", outerArray);
        outerObject.put("entity_code", "LE01");
        outerObject.put( "entity_desc","Dummy Legal Entity");
        outerObject.put("entity_name", "Dummy Legal Entity");
        outerObject.put("entity_type", "LE");
        System.out.println(outerObject.toString());

//        Gson gson=new Gson();
//       String jsonStr= gson.toJson(outerObject);
//        System.out.println(jsonStr);
//
//        System.out.println("After add :"+outerObject.toJSONString());
    }
}
