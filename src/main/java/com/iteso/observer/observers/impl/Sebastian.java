package com.iteso.observer.observers.impl;

import java.util.Random;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Sebastian implements iObserver {
	public String lastMessage;
	
    public String getLastMessage() {
        return lastMessage;
    }

	public void sendMessage(String sMessage) {
		this.setLastMessage(lastMessage);
		SWDP2016.notifyObservers(sMessage);
	}
	
	public void setLastMessage(String sMessage) {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (new Random().nextBoolean()) {
            this.setLastMessage(sMessage);
        }
        else {
            this.setLastMessage("My idea is better");
        }
	}
}
