package com.example.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

public class Practice2JsonToList {

    //this boolean taken bz I want to specify the where is my node start
    private static boolean isNodeFound;
    public static void main(String[] args) throws JSONException {

        String str = "{'title': \"PARENT\",\"item_id\": 1, " +
                " \"children\": [{\"title\": \"LEVEL 2\",\"item_id\": 2," +
                "\"children\": [ {\"title\": \"LEVEL 3.1\",\"item_id\": 3, " +
                " \"children\": [ {\"title\": \"LEVEL 4.1\", \"item_id\": 4}," +
                "{\"title\": \"LEVEL 4.2\",\"item_id\": 5}]}, {\"title\": \"LEVEL 3.2\",\"item_id\": 6}]}]}";
        //convert it into JsonString to JsonObject
        JSONObject jsonObject=new JSONObject(str);
        recursiveTraverse(jsonObject);

    }

    private static void recursiveTraverse(JSONObject currentObject) throws JSONException {
        for(Iterator it=currentObject.keys(); it.hasNext();){
            Object currentKey = it.next();
            String nextKey=(String) currentKey;
            Object value=currentObject.get((String) currentKey);
            if(value instanceof JSONObject){
                recursiveTraverse((JSONObject) value);
            }else if(value instanceof JSONArray){
            //if it is in JsonArray then convert it into JsonObject
            JSONArray array=(JSONArray) value;
            for (int i=0;i<array.length();i++){
                Object object=array.get(i);
                JSONObject jsonObject= (JSONObject) object;
                recursiveTraverse(jsonObject);
            }
            }else {
               // System.out.println(nextKey+":"+value.toString());
//                if(value.equals("3")){ this will print nothing because value has Object Data type
                if(value.toString().equals("4")){//here we convert it into String by value.toString
                    isNodeFound=true;
                }
         //       if(isNodeFound){//this gives the value with level also
                if(isNodeFound && nextKey.equals("item_id"))
                    System.out.println(value);
                }
            }
        }
    }

