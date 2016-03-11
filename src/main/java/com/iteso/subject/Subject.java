package com.iteso.subject;
import com.iteso.observer.Observer;
/**
 * Created by to_r_ on 3/11/2016.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String LastMessage);
}
