package com.example.demo.jsonAdding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Child {
    public ArrayList<Child> children;
    public String entity_code;
    public String entity_desc;
    public String entity_name;
    public String entity_type;

    public Child(String entity_code,String entity_desc,String entity_name,String entity_type) {
        this.entity_code=entity_code;
        this.entity_desc=entity_desc;
        this.entity_name=entity_name;
        this.entity_type=entity_type;
        children = new ArrayList<Child>();
    }
    public void add(Child c){
        this.children.add(c);
    }

//    public void setChild(String str){
//        children.add(str);
//    }
//
//    public void add(String str1) {
//        children.add(str1);
//    }
//    public void add1(String obj){
//        this.children.add1(obj);
//    }
}
