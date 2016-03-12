package com.iteso.observerpattern.Subject;


import com.iteso.observerpattern.ObserverTests.iObserver;

/**
 * Created by lnvitado on 11/03/2016.
 */
public interface iSubject {
    void registerObserver(iObserver observer, String name);
    void removeObserver(iObserver observer);
    void notifyObservers();
    void sendMessage(String message);
}
