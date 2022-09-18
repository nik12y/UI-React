package com.example.demo.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "item")

@NoArgsConstructor
public class Item {

    @Id
    private int id;

    private String name;

    public Item(int b,String value) {
        this.id=b;
        this.name=value;
    }

    public Item(String name) {
        this.name=name;
    }
}
