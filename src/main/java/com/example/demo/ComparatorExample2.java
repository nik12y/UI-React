package com.example.demo;


import javax.swing.text.html.parser.Entity;
import java.util.Comparator;

public class ComparatorExample2 {
    public static void main(String[] args) {


    }

    class App {
        private Integer age;
        private String name;

        public App() {
        }

        @Override
        public String toString() {
            return "App{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public App(Integer age, String name) {
            this.age = age;
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
