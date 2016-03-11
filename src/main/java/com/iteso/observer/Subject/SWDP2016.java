package com.iteso.observer.Subject;

import com.iteso.observer.Observer.*;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements Subject {
    ArrayList<Observer> Observer;

    public SWDP2016() {
        Observer= new ArrayList<Observer>(15);
    }

    public void addname(String add) {
        Observer.add(Observer);
    }

    public void Delete(String delete) {
        Observer.remove(Observer);
    }

    public void Notify(String notify) {

    }
}