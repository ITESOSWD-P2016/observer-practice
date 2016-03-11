package com.iteso.observer;

/**
 * Created by luis_ on 11/03/2016.
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}