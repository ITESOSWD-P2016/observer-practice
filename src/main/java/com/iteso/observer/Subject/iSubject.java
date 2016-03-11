package com.iteso.observer.Subject;


import com.iteso.observer.Observer.iObserver;

/**
 * Created by lnvitado on 11/03/2016.
 */
public interface iSubject {
    void registerObserver(iObserver observer);
    void removeObserver(iObserver observer);
    void notifyObservers();
}
