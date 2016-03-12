package com.iteso.observers.Subject.impl;
import com.iteso.observers.Observers.iObserver;
import com.iteso.observers.Subject.*;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject{

    public boolean addObserver(iObserver Observer) {
        return listObservers.add(Observer);
    }

    public boolean deleteObserver(iObserver Observer) {
        return listObservers.remove(Observer);
    }

    public static void notifyObservers(String sMessage) {
        for (iObserver o : listObservers)
            o.setLastMessage(sMessage);
    }
}