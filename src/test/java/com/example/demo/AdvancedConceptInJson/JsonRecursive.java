package com.example.demo.AdvancedConceptInJson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class JsonRecursive {
    private static  boolean isNodeFound;

    public static void main(String[] args) throws JSONException {
        String str = "{\"entity_desc\":\"Dummy Legal Entity\",\"entity_type\":\"LE\",\"entity_code\":\"LE01\"," +
                "\"entity_name\":\"Dummy Legal Entity\",\"children\":[{\"entity_desc\":\"Dummy Retail market entity\"," +
                "\"entity_type\":\"MKE\",\"entity_code\":\"MKE01\",\"entity_name\":\"Dummy Retail market entity\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Corporate finance\",\"entity_type\":\"BU\",\"entity_code\":\"BU02\",\"entity_name\":\"Dummy Corporate finance\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Branch Corporate finance\",\"entity_type\":\"BR\",\"entity_code\":\"BR2.1\",\"entity_name\":\"Dummy Branch Corporate finance\"," +
                "\"children\":[]}]}]}]}";
        JSONObject jsonObject=new JSONObject(str);

        String str1="[{\"entity_desc\":\"Dummy Home finance\",\"entity_type\":\"BU\",\"entity_code\":\"BU01," +
                      "\"entity_name\":\"Dummy Home finance\"}]";
        recursiveTraverse(jsonObject);
        JSONArray jsonArray=new JSONArray(str1);
        jsonData("LE01",jsonArray);
    }

    private static void jsonData(String id,JSONArray data) throws JSONException {
         if(id!=null){
//         JSONArray array=new JSONArray();
//         array.put(data);
            for(int i=0;i<data.length();i++){
                Object object = data.get(i);
               JSONObject jsonObject=(JSONObject) object;
               recursiveTraverse(jsonObject);
            }
         }
    }

    private static void recursiveTraverse(JSONObject currentObject) throws JSONException {

        for(Iterator it=currentObject.keys();it.hasNext();){
          Object currentKey= it.next();
              String nextKey= (String) currentKey;
            Object value = currentObject.get((String) currentKey);
            if(value instanceof JSONObject){
                recursiveTraverse((JSONObject) value);
            }else if(value instanceof JSONArray){
                JSONArray array= (JSONArray) value;
                for(int i=0;i< array.length();i++){
                    Object object = array.get(i);
                    JSONObject jsonObject=(JSONObject) object;
                    recursiveTraverse(jsonObject);
                }
            }else {
              //  System.out.println(nextKey + ":" + value);
                if(value.toString().equals("LE")){
                    isNodeFound=true;
                }
                if(isNodeFound && nextKey.equals("entity_type")){
                    System.out.println(value);
                }
            }
        }
    }


}
