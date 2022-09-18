package com.example.demo.recursiveMethodJSOn;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;

public class NikCodeParentChild {
    private static boolean isNodeFound;
    private static JSONParser parser = new JSONParser();

    public static void main(String[] args) throws JSONException, ParseException {
      /*  String str = "{\"entity_desc\":\"Dummy Legal Entity\",\"entity_type\":\"LE\",\"entity_code\":\"LE01\"," +
                "\"entity_name\":\"Dummy Legal Entity\",\"children\":[{\"entity_desc\":\"Dummy Retail market entity\"," +
                "\"entity_type\":\"MKE\",\"entity_code\":\"MKE01\",\"entity_name\":\"Dummy Retail market entity\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Corporate finance\",\"entity_type\":\"BU\",\"entity_code\":\"BU02\",\"entity_name\":\"Dummy Corporate finance\"," +
                "\"children\":[{\"entity_desc\":\"Dummy Branch Corporate finance\",\"entity_type\":\"BR\",\"entity_code\":\"BR2.1\",\"entity_name\":\"Dummy Branch Corporate finance\"," +
                "\"children\":[]}]}]}]}";*/
        String str = "{\"entity_code\":\"\",\"entity_name\":\"\",\"entity_desc\":\"\",\"entity_type\":\"\"}";
        JSONObject parentObject = new JSONObject(str);

        String str1 = "[{\"name\": \"Sam Smith\", \"technology\": \"Python\"}]";
        JSONArray childObject = (JSONArray) parser.parse(str1);

//         Child child=new Child();
//         child.add(str1);
        System.out.println(addChild(parentObject, "", childObject));

        //    setUp(jsonObject,child);

    }

    private static JSONObject addChild(JSONObject parent, String parentId, JSONArray childData) throws JSONException {
        for (Iterator it = parent.keys(); it.hasNext(); ) {

            Object parentKey = it.next();

            Object value = parent.get((String) parentKey);
            if (parentId.isEmpty()) {
                addChildInEmptyObject(parent, parentId, childData);
            } else if (value.toString().equals(parentId.isEmpty())) {
                parent.put("children", childData);

            }
//        }
        }
        return parent.put("children",childData);
    }

    private static void addChildInEmptyObject(JSONObject parent, String parentId, JSONArray childData) {
        parent.keys().forEachRemaining(key -> {
            try {
                Object o = parent.get((String) key);
                     JSONObject jsonObject=(JSONObject)o;
                System.out.println("difif: "+o.getClass());
                    if (jsonObject instanceof JSONObject) {
                        parent.put("children", childData);
                    }else {
                        parent.put("children", childData);
                    }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        });

    }
//    private static JSONArray addChildInEmptyObject(JSONArray childData){
//             JSONArray array=new JSONArray();
//        for (Iterator it = childData.iterator(); it.hasNext(); ) {
//            Object next = it.next();
//            addChildInEmptyObject(childData);
//             if(jsonObject!=null)
//                array.add(jsonObject);
//        }
//        return childData;
//    }
}

