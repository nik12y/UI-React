package com.example.demo.recursiveMethodJSOn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;
import java.util.Set;

public class AddChildToEmptyParent {

    private static final JSONParser jsonParser = new JSONParser();

    public static void main(String[] args) throws ParseException, JSONException {


        String str = "{\"entity_code\":\"\",\"entity_name\":\"\",\"entity_desc\":\"\",\"entity_type\":\"\"}";
        JSONObject jsonObject = (JSONObject) jsonParser.parse(str);

        String str1 = "{\"name\": \"Sam Smith\", \"technology\": \"Python\"}";
//        JSONArray childObject = (JSONArray) jsonParser.parse(str1);
      JSONObject childObject=(JSONObject) jsonParser.parse(str);
//         Child child=new Child();
//         child.add(str1);
        addChild(jsonObject, "", childObject);
    }

    private static void addChild(JSONObject jsonObject, String parentId, JSONObject childData) throws JSONException {
        //Extract the parent key
        //Iterate over it and then use loop
        //use while loop
        Set<String> keySet = jsonObject.keySet();
        Iterator<String> jsonIterator = keySet.iterator();
        String keyStr = "";
        boolean isEntityFound = false;
        while (jsonIterator.hasNext()) {
            keyStr = jsonIterator.next();
            Object value = jsonObject.get(keyStr);
            if(parentId.isEmpty()){
                if (value.equals(parentId)){
                     isEntityFound=true;
                    Object children = jsonObject.put(value, childData);
                          JSONObject jsonObject1=(JSONObject)children;
                    JSONObject children2 = (JSONObject) jsonObject.get(value.toString());
//                    JSONArray children1 = children2.getJSONArray("Children");
//                     for(int i=0;i<children1.length();i++){
//                         System.out.println(children1.getInt(i));
//                     }
                    System.out.println("Hi all");

                } if(value instanceof JSONObject){
                     addChild((JSONObject) value,parentId,childData);
                }
            }
        }
    }
}
