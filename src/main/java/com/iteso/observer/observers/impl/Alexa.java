package com.iteso.observer.observers.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Alexa implements iObserver {
    private String lastMessage;

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String words) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.lastMessage = words;
    }

	public void sendMessage(String sMessage) {
		setLastMessage(sMessage);
		SWDP2016.notifyObservers(sMessage);
		
	}
}
