package com.example.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class PracticeJsonToList {

    private static boolean isNodeFound;
    public static void main(String[] args) throws JSONException {


        String str = "{'title': \"PARENT\",\"item_id\": 1, " +
                " \"children\": [{\"title\": \"LEVEL 2\",\"item_id\": 2," +
                "\"children\": [ {\"title\": \"LEVEL 3.1\",\"item_id\": 3, " +
                " \"children\": [ {\"title\": \"LEVEL 4.1\", \"item_id\": 4}," +
                "{\"title\": \"LEVEL 4.2\",\"item_id\": 5}]}, {\"title\": \"LEVEL 3.2\",\"item_id\": 6}]}]}";
        //convert JsonString TO jsonObject Using JsonObject
        JSONObject jsonObject=new JSONObject(str);
        recursiveTraverse(jsonObject);
    }

    private static void recursiveTraverse(JSONObject currentObject) throws JSONException {
        for(Iterator it=currentObject.keys();it.hasNext();){
           Object currentKey= it.next();
            String nextKey=(String) currentKey;
             Object value= currentObject.get((String)currentKey);
             if(value instanceof JSONObject){
                 recursiveTraverse((JSONObject) value);
             }else if(value instanceof JSONArray){
                 //abhi jo value h meri vo jsonObject me h usko convert krna honga jsonArray me bz next is jsonArray
                 JSONArray array=(JSONArray) value;
                 for(int i=0; i<array.length();i++){
                     Object object = array.get(i);
                     JSONObject jsonObject=(JSONObject) object;
                     recursiveTraverse(jsonObject);
                 }
             }else {
                 //this will print list of values for item_id
            //     System.out.println(nextKey +":"+value);
                 //now i want those item_id which i want
                 if(value.toString().equals("4"))
                 {
                     isNodeFound=true;
                 }
                 //if we don't wont level then use isNodeFound && nextKey.toString("item_id")
                 if (isNodeFound && nextKey.equals("level")){
                     System.out.println("value :"+value);
                 }
             }
        }
    }
}
