package com.iteso.observer.subjects;

import com.iteso.observer.observers.iObserver;

/**
 * Created by Sebastian on 11/03/16.
 */
public interface iSubject {
    public void newObserver(iObserver observer);
    public void removeObserver(iObserver observer);
    public void notifyObserver(String Message);
}
