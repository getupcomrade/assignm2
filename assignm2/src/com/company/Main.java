package com.company;

public class Main {

    public static void main(String[] args) {
	Store onlineShop = new Store();
        Observer first= new Client("Howard"," Hamlin");
        Observer second= new Client("James"," McGill");
        Observer third= new Client("Charles"," McGill");
        Observer fourth= new Client("Kim"," Wexler");
        onlineShop.addProduct("Laptop HP");
        onlineShop.addProduct("Samsung Galaxy s20");
        onlineShop.addProduct("Laptop ASUS");//adding products to the arraylist
        onlineShop.addClient(first);
        onlineShop.addClient(fourth);
        onlineShop.addClient(third);//adding Howard,Charles,Kim,so they get notified
        onlineShop.notifyClients();//start notifying clients

//making some changes
        onlineShop.removeProduct("Samsung Galaxy s20");
        onlineShop.addProduct("Iphone 13");
        onlineShop.addProduct("PS 5");
        onlineShop.removeClient(fourth);
        onlineShop.removeClient(third);//deleting Kim, Charles, so they don't get notified
        onlineShop.addClient(second);
        onlineShop.notifyClients();//start notifying clients
//now only Howard and James can receive notification

    }
}
