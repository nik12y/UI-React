package com.example.demo;

import com.example.demo.customer.Customer;
import com.example.demo.items.Item;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.repository.InstructorRepo;
import com.example.demo.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//    @Autowired
//    private CustomerRepo customerRepo;

    @Autowired
    private InstructorRepo instructorRepo;



//    @Autowired
//    private ItemRepo itemRepo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

  /*  @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer("Mohan");
        Item item = new Item("Nihal");
        Item item2 = new Item("Sajid");

        customer.getItems().add(item);
        customer.getItems().add(item2);

        customerRepo.save(customer);
*/
//
//        item.setName("nik");
//        item.setName("Sajid");


//        itemRepo.save(item);
 //  }
}
