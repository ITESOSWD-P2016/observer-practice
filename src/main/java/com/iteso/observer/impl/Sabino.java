package com.iteso.observer.impl;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Sabino {
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = "ignore message ask again";
        getSwdp2016().askQuestionToTeacher("can you repeat?");
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
        getSwdp2016().askQuestionToTeacher(getLastQuestion());    }
}
