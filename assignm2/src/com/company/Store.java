package com.company;

import java.util.ArrayList;
import java.util.List;

public class Store implements Observable{
    List<String> products= new ArrayList<>();
    List<Observer> clients= new ArrayList<>();

    @Override
    public void addClient(Observer observer) {
        this.clients.add(observer);
    }

    @Override
    public void removeClient(Observer observer) {
        this.clients.remove(observer);
    }

    public void addProduct (String product){
        this.products.add(product);
    }
    public void removeProduct (String product){
        this.products.remove(product);
    }
    @Override
    public void notifyClients() {
        for (Observer observer: clients){
            observer.update("sale");
            System.out.println("There is a discount for these products now:\n"+this.products+"\nHurry up to buy!\n");
        }
    }
}
