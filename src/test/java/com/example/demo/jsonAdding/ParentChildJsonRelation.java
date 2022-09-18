package com.example.demo.jsonAdding;

import com.google.gson.Gson;
import org.checkerframework.checker.units.qual.C;
import org.json.simple.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParentChildJsonRelation {
    public static void main(String[] args) {
//
        Child child=new Child("LE01","Dummy Legal Entity","Dummy Legal Entity","LE");
        Child child1=new Child("MKE01","Dummy Retail market entity","Dummy Retail market entity","MKE");
        Child child2=new Child("BU02","Dummy Corporate finance","Dummy Corporate finance","BU");
        Child child3=new Child("BR2.1","Dummy Branch Corporate finance","Dummy Branch Corporate finance","BR");
        child2.add(child3);
        child1.add(child2);
        child.add(child1);
         System.out.println(setUp(child).toString());

    }

    private static JSONObject setUp(Child child){
        if (child==null)
            return null;
        Map<String,Object> map=new HashMap<>();
        JSONArray array=new JSONArray();
        for(Child r:child.getChildren()){
            JSONObject innerObject = setUp(r);
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
    }
}
