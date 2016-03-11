package com.iteso.observer.subject;

import com.iteso.observer.observers.Observer;

import java.util.ArrayList;

/**
 * Created by Sabino on 11/03/2016.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);

}
