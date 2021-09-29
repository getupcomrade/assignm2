package com.company;

import java.util.List;

public class Client implements Observer{
    String firstname;
    String lastname;
    public Client(String name,String lastname){
        this.firstname=name;
        this.lastname=lastname;
    }
    @Override
    public void update(String message) {
        System.out.println("Hello "+firstname+lastname+ "!");
    }
}
