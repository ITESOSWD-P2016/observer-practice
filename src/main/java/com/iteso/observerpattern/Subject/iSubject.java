package com.iteso.observerpattern.Subject;


import com.iteso.observerpattern.Observer.iObserver;

/**
 * Created by lnvitado on 11/03/2016.
 */
public interface iSubject {
    void registerObserver(iObserver observer);
    void removeObserver(iObserver observer);
    void notifyObservers();
    void sendMessage(String message);
}
