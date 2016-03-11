package com.iteso.observer.subjects.impl;

import com.iteso.observer.observers.*;
import com.iteso.observer.subjects.*;

import java.util.ArrayList;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements Subject{
	private final ArrayList observers;
	
    

    public SWDP2016(){
        observers  = new ArrayList();	
    }
    

    public void sendMessageToStudents(String message) {
    	for (Object observer1 : observers){
    		Observer observer  = (Observer)observer1;
    		observer.setLastMessage(message);
    		
    	}

    }
    public void askQuestionToTeacher(String question){
        rodrigo.setLastQuestion(question);

    }


	@Override
	public void registrarObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
