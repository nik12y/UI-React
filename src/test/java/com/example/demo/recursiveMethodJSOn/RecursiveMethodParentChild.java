package com.example.demo.recursiveMethodJSOn;


import org.json.JSONException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.*;

public class RecursiveMethodParentChild {

    private static boolean isNodeFound;

    private static final JSONParser jsonParser = new JSONParser();

    public static void main(String[] args) throws JSONException, ParseException {
     /*    String str= "{\"entity_desc\":\"Dummy Legal Entity\",\"entity_type\":\"LE\",\"entity_code\":\"LE01\"," +
                "\"entity_name\":\"Dummy Legal Entity\",\"children\":[{\"entity_desc\":\"Dummy Retail market entity\"," +
                "\"entity_type\":\"MKE\",\"entity_code\":\"MKE01\",\"entity_name\":\"Dummy Retail market entity\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Corporate finance\",\"entity_type\":\"BU\",\"entity_code\":\"BU02\",\"entity_name\":\"Dummy Corporate finance\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Branch Corporate finance\",\"entity_type\":\"BR\",\"entity_code\":\"BR2.1\",\"entity_name\":\"Dummy Branch Corporate finance\"," +
                "\"children\":[]}]}]}]}";*/

       String str="{\"entity_code\":\"GBC\",\"entity_name\":\"test\",\"entity_desc\":\"test\",\"entity_type\":\"GB\",\"children\":[{}]}";
        JSONObject mainJsonObject = (JSONObject) jsonParser.parse(str);

        JSONObject childData = (JSONObject) jsonParser.parse("{\"entity_desc\":\"Dummy Legal Entity\",\"entity_type\":\"LE\",\"entity_code\":\"LE01\",\"entity_name\":\"Legal Entity\"}");
//                "\"entity_name\":\"Dummy Legal Entity\"}");
        addChild(mainJsonObject, "GBC", childData);

    }

    private static void addChild(JSONObject jsonObject, String parentId, JSONObject childData) throws JSONException {

        Set<String> keySet = jsonObject.keySet();
        Iterator<String> jsonIterator = keySet.iterator();
        if(keySet.isEmpty() && keySet.size()==0){
            jsonObject.put(parentId,childData);
            return;
        }
        String keyStr = "";
        boolean isEntityFound = false;
        while (jsonIterator.hasNext()) {
            keyStr = jsonIterator.next();
            Object keyvalue = jsonObject.get(keyStr);
            if (keyvalue.equals(parentId)) {
                isEntityFound = true;
            }
            if (keyvalue instanceof JSONArray && isEntityFound == true) {
                ((JSONArray) keyvalue).add(childData);
                return;
            } else if (keyvalue instanceof JSONArray && isEntityFound != true) {
                addChildArray((JSONArray) keyvalue, parentId, childData);
            }
            //System.out.println(keyStr);
        }
        System.out.println(jsonObject);
    }

    private static void addChildArray(JSONArray jsonArray, String parentId, JSONObject childJSONObject) throws JSONException {

        for (int i = 0; i < jsonArray.size(); i++) {
            if (jsonArray.get(i) instanceof JSONObject) {
                addChild((JSONObject) jsonArray.get(i), parentId, childJSONObject);
            }
            System.out.println("");
        }
    }
}



 /*   private static JSONObject setUp(JSONObject jsonObject, Child child){
        if (child==null)
            return null;
        Map<String,Object> map=new HashMap<>();
         JSONArray array=new JSONArray();
        for(Child r:child.getChildren()){
            JSONObject innerObject = setUp(r,);
            if(innerObject!=null){
                array.add(innerObject);
            }
        }
        map.put("entity_code",child.getEntity_code());
        map.put("entity_desc",child.getEntity_desc());
        map.put("entity_name",child.getEntity_name());
        map.put("entity_type",child.getEntity_type());
        map.put("children",array);

        return new JSONObject(map);
    }*/
