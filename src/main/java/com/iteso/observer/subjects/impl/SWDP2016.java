package com.iteso.observer.subjects.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.iSubject;


import java.util.ArrayList;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject {
    ArrayList<iObserver> observers;

    public SWDP2016(){
        observers= new ArrayList<iObserver>(15);

    }

    public void newObserver(iObserver observer) {
    observers.add(observer);
    }

    public void removeObserver(iObserver observer) {
    observers.remove(observer);
    }

    public void notifyObserver(String Message) {

    }
}
