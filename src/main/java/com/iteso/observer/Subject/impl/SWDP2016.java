package com.iteso.observer.Subject.impl;

import com.iteso.observer.Observer.iObserver;
import com.iteso.observer.Observer.impl.*;
import com.iteso.observer.Subject.iSubject;

import java.util.ArrayList;


/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject {

    private ArrayList observers = null;
    private String message;


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
        for (Object theObserver : observers) {
            iObserver observer = (iObserver) theObserver;
            observer.sendMessage(this.message);
        }
    }

    public void setMessage( String msg){
        this.message = msg;
        notifyObservers();
    }


    /*


    public void sendMessageToStudents(String message) {
        alejandra.tellMeSomething(message);
        alexa.tryToGetMyAttention(message);
        antonio.maybeIllListen(message);
        ariana.setLastMessage(message);
        cristhian.setLastMessage(message);
        flavio.setLastMessage(message);
        jorge.setLastMessage(message);
        josue.tryToSendMeMessage(message);
        luis.setLastMessage(message);
        rene.setLastMessage(message);
        sabino.setLastMessage(message);
        saul.setLastMessage(message);
        sebastian.setWhateverMessageIWantWhenIWant(message);

    }
    public void askQuestionToTeacher(String question){
        rodrigo.setLastQuestion(question);

    }
    */
}
