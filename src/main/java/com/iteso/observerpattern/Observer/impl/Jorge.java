package com.iteso.observerpattern.Observer.impl;

import com.iteso.observerpattern.Observer.iObserver;
import com.iteso.observerpattern.Subject.iSubject;


/**
 * Created by rvillalobos on 3/10/16.
 */
public class Jorge implements iObserver {
    private String name;
    private iSubject slackgroup;
    private String lastMessage;
    private String lastQuestion;

    public Jorge(iSubject chatSWDP2016, String aName){
        iSubject newslackgroup = chatSWDP2016;
        this.name = aName;
        setSlackGroup(newslackgroup);
        newslackgroup.registerObserver(this);
    }


    public void sendMessageToChat(String message) {
        slackgroup = this.getSlackGroup();
        this.setLastMessage(message);
        System.out.println("<< "+ name +" envió: " + this.lastMessage);
        slackgroup.sendMessage(lastMessage);
    }

    public void updateChat(String message) {
        this.setLastMessage(message);
        System.out.println("> "+ name +" recibió: " + this.lastMessage);
    }

    public void sendMessage(String message){
        this.setLastMessage(message);
        this.sendMessageToChat(this.lastMessage);
    }

    public void sendQuestion(String question){
        this.setLastQuestion(question);
        this.sendMessageToChat(lastQuestion);
    }





    public iSubject getSlackGroup() {
        return slackgroup;
    }

    public void setSlackGroup(iSubject slackgroup) {
        this.slackgroup = slackgroup;
    }



    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getLastQuestion() {
        return lastQuestion;
    }

    public void setLastQuestion(String lastQuestion) {
        this.lastQuestion = lastQuestion;
    }


}
