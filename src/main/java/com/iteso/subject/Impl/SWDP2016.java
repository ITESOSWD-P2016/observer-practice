package com.iteso.subject.Impl;

import com.iteso.observer.Observer;
import com.iteso.subject.Subject;

import java.util.ArrayList;

public class SWDP2016 implements Subject{
    private ArrayList observers;

    public SWDP2016() {
        observers = new ArrayList();
    }

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
    */
    public void askQuestionToTeacher(String question){
        rodrigo.setLastQuestion(question);

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observers.indexOf(observer));
    }

    public void notifyObservers(String LastMessage) {
        for (Object observer1 : observers) {
            Observer observer = (Observer) observer1;
            observer.sendMessage(LastMessage);
        }
    }
}
