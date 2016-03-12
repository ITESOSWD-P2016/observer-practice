package com.iteso.observers.Observers.impl;

import com.iteso.observers.Observers.iObserver;
import com.iteso.observers.Subject.impl.*;
/**
 * Created by rvillalobos on 3/10/16.
 */
public class Alejandra implements iObserver {

    public String lastMessage;

    public String getLastMessage() {
        return lastMessage;
    }

    public void sendMessage(String sMessage) {
        this.setLastMessage(lastMessage);
        SWDP2016.notifyObservers(sMessage);
    }

    public void setLastMessage(String something) {
        this.lastMessage = something;
        String complain = "will you give more checkpoints for that?";
        SWDP2016.notifyObservers(complain);
    }

}