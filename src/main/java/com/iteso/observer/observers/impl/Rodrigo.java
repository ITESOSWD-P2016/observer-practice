package com.iteso.observer.observers.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subject.iSubject;
import com.iteso.observer.subject.impl.SWDP2016;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class Rodrigo implements iObserver {
    private iSubject subject;
    private String lastMessage;
    private String lastQuestion;

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

    public iSubject getSubject() {
        return subject;
    }

    public void setSubjet(iSubject s) {
        this.subject = s;
    }

    public void askSomething(String myQuestion){
        setLastQuestion(myQuestion);
        subject.notifyObservers(getLastQuestion());
    }

	public void sendMessage(String s) {
		askSomething(s);
		
	}

}
