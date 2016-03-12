package com.iteso.observer.observers.impl;

import java.util.Random;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Antonio implements iObserver {
    private String lastMessage;

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String words) {

        Random random = new Random();
        if (random.nextBoolean()) {
            this.lastMessage = words;
        }
    }

    public void sendMessage(String myQuestion){
        this.setLastMessage(myQuestion);
        SWDP2016.notifyObservers(this, myQuestion);
    }
}
