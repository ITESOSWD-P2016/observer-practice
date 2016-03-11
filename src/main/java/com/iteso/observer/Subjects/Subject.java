package com.iteso.observer.Subjects;

import com.iteso.observer.Observers.IObserver;

/**
 * Created by luis_ on 11/03/2016.
 */

public interface Subject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String message);
}