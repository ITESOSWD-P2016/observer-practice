package com.iteso.observer.observers.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Rodrigo implements iObserver {
	public String lastMessage;
	
    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.setLastMessage(lastMessage); 
    }
    
	public void sendMessage(String sMessage) {
		this.setLastMessage(lastMessage);
		SWDP2016.notifyObservers(this, sMessage);
	}
	
}
