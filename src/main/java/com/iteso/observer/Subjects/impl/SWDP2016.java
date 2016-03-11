package com.iteso.observer.Subjects.impl;

import com.iteso.observer.Observers.IObserver;
import com.iteso.observer.Subjects.Subject;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 3/10/16.
 package com.iteso.observer;

 /**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements Subject {
    private  ArrayList observers;

    public SWDP2016(){
        observers = new ArrayList();
    }
    public void removeObserver(IObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }
    public void notifyObservers(String message) {
        for (Object observer1 : observers) {
            IObserver observer = (IObserver) observer1;
            observer.sendMessageToStudents(message);
        }
    }



}