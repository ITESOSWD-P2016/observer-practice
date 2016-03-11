package com.iteso.observer.observers.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Rene implements iObserver {
    private String lastMessage;
    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = "something different";
    }

    public void sendMessage(String myQuestion){
        setLastMessage(myQuestion);
        SWDP2016.notifyObservers(myQuestion);
    }
}
