package com.example.springdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VijaytutorialApplication implements CommandLineRunner {


    /*
    ProdDb proddb;
    DevDb devdb;
    @Autowired
    DB db;
    */

    public static void main(String[] args) {
        SpringApplication.run(VijaytutorialApplication.class, args);


    }
    @Override
    public void run(String... args) throws Exception {

        /*
        devdb = new DevDb();
      	proddb = new ProdDb();
        System.out.println(devdb.getData());
        System.out.println(proddb.getData());
        db = new DevDb();
        System.out.println(db.getData());
         */

    }
}
