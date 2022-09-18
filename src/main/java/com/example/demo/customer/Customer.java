package com.example.demo.customer;

import com.example.demo.items.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private int id;

    private String name;

//    @OneToOne
//    @JoinColumn(name = "item_id")
//    private Item item;
//
//    @OneToMany
//    @JoinColumn(name = "customer_id")
//    private List<Item> items=new ArrayList<>();

//    public Customer(int a,String name){
//        this.id=a;
//        this.name=name;
//    }
//
//    public Customer(String name) {
//        this.name=name;
//
//    }
}
