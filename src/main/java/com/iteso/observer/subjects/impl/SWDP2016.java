package com.iteso.observer.subjects.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.iSubject;
import java.util.ArrayList;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject{
    private final ArrayList observers;
    private String lastMessage;
    private String lastQuestion;

    public SWDP2016(){
        observers = new ArrayList();
    }

    public void registerObserver(iObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(iObserver observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers() {
        for (Object observer1 : observers) {
            iObserver observer = (iObserver) observer1;
            observer.chatUpdate(this.lastMessage, this.lastQuestion);
        }
    }

    public void setMessage(String lMessage, String lQuestion){
        this.lastMessage = lMessage;
        this.lastQuestion = lQuestion;
    }


    public void askQuestionToTeacher(String question){
        this.lastQuestion = question;
    }
}
