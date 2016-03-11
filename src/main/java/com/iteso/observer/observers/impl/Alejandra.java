package com.iteso.observer.observers.impl;

import com.iteso.observer.subjects.iSubject;
import com.iteso.observer.observers.iObserver;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Alejandra {
    private iSubject swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {
        return lastMessage;
    }

    public void tellMeSomething(String something) {
        this.lastMessage = something;
        String complain = "will you give more checkpoints for that?";
        getSwdp2016().askQuestionToTeacher(complain);
    }

    public String getLastQuestion() {
        return lastQuestion;
    }

    public void setLastQuestion(String lastQuestion) {
        this.lastQuestion = lastQuestion;
    }

    public iSubject getSwdp2016() {
        return swdp2016;
    }

    public void setSwdp2016(iSubject swdp2016) {
        this.swdp2016 = swdp2016;
    }

    public void askSomething(String myQuestion){
        setLastQuestion(myQuestion);
        getSwdp2016().askQuestionToTeacher(getLastQuestion());
    }
}
