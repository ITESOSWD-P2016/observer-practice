package com.iteso.observer.Observers.impl;

import com.iteso.observer.Observers.IObserver;
import com.iteso.observer.Subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Alejandra implements IObserver {
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {
        return lastMessage;
    }


    public void tellMeSomething(String something) {
        this.lastMessage = something;
        String complain = "will you give more checkpoints for that?";
        getSwdp2016().notifyObservers(complain);
    }

    public String getLastQuestion() {
        return lastQuestion;
    }

    public void setLastQuestion(String lastQuestion) {
        this.lastQuestion = lastQuestion;
    }

    public SWDP2016 getSwdp2016() {
        return swdp2016;
    }

    public void setSwdp2016(SWDP2016 swdp2016) {
        this.swdp2016 = swdp2016;
    }

    public void askSomething(String myQuestion){
        setLastQuestion(myQuestion);
        getSwdp2016().notifyObservers(getLastQuestion());
    }

    public void sendMessageToStudents(String message) {
        this.lastMessage = message;
    }


}
