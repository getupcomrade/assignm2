package com.company;

public interface Observable {
    public void addClient(Observer observer);
    public void removeClient(Observer observer);
    public void notifyClients();
}
