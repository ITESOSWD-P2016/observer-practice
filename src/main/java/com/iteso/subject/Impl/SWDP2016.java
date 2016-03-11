package com.iteso.subject.Impl;

import com.iteso.observer.Observer;
import com.iteso.subject.Subject;

import java.util.ArrayList;

public class SWDP2016 implements Subject{
    private ArrayList observers;

    public SWDP2016() {
        observers = new ArrayList();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers(String LastMessage) {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.sendMessage(LastMessage);
        }
    }
}
