package com.iteso.observer.Observer.impl;

import com.iteso.observer.Observer.iObserver;
import com.iteso.observer.Subject.iSubject;
import com.iteso.observer.Subject.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Cristhian implements iObserver {
    private String name;
    private SWDP2016 swdp2016;
    private String lastMessage;
    private String lastQuestion;

    public Cristhian(iSubject chatSWDP2016, String aName){
        iSubject slack = chatSWDP2016;
        this.name = aName;
        slack.registerObserver(this);
    }

    public void sendMessage(String message) {
        this.lastMessage = message;
    }



    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

  //  public String getLastQuestion() {
  //      return lastQuestion;
  //  }

  //  public void setLastQuestion(String lastQuestion) {
    //    this.lastQuestion = lastQuestion;
   // }

    public SWDP2016 getSwdp2016() {
        return swdp2016;
    }

    public void setSwdp2016(SWDP2016 swdp2016) {
        this.swdp2016 = swdp2016;
    }

    /*public void askSomething(String myQuestion){
        setLastQuestion(myQuestion);
        getSwdp2016().askQuestionToTeacher(getLastQuestion());    }*/




}
