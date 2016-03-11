package com.iteso.observer.subjects;

import com.iteso.observer.observers.iObserver;

/**
 * Created by jorge on 11/03/16.
 */
public interface iSubject {

    void registerObserver(iObserver iObserver);
    void removeObserver(iObserver iObserver);
    void notifyObservers();
    void askQuestionToTheTeacher(String question);

}
