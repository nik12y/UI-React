package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
@Setter
@Getter
class Student {
    // private String name;
    private String entity_code;
    private String entity_desc;
    private String entity_name;
    private String entity_type;
    private List<Student> students;

    public Student(String entity_code, String entity_desc, String entity_name, List<Student> students) {
        this.entity_code = entity_code;
        this.entity_desc = entity_desc;
        this.entity_name = entity_name;
        this.students = students;
    }
    public Student(String entity_code, List<Student> students) {
        this.entity_code = entity_code;
        this.students = students;
    }

    public Student(String entity_code) {
        this.entity_code = entity_code;
    }
}

public class AddingAnElementInJson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // pretty print JSON
        Student student = new Student( "entity_code",Arrays.asList(new Student("BU01")));
//        Student student=new Student();
//        student.setStudents("entity_code",Arrays.asList("BU01"));
//        student.setStudents("entity_desc",Arrays.asList("Dummy Home Home"));
//        student.setStudents("entity_name",Arrays.asList("Dummy Home finance"));
//        student.setStudents("entity_type",Arrays.asList("BU"));

        System.out.println(student);
        String jsonStr = gson.toJson(student, Student.class);
        System.out.println("JSON String: \n" + jsonStr);
        JsonElement jsonElement = gson.toJsonTree(student);
        jsonElement.getAsJsonObject().addProperty("entity_code ","MKE01");
        jsonElement.getAsJsonObject().addProperty( "entity_desc", "Dummy Retail market entity");
        jsonElement.getAsJsonObject().addProperty( "entity_name", "Dummy Retail market entity");
        jsonElement.getAsJsonObject().addProperty( "entity_type", "MKE");
        jsonStr = gson.toJson(jsonElement);
        System.out.println("JSON String after inserting additional property: \n" + jsonStr);
    }
}
// Student class


