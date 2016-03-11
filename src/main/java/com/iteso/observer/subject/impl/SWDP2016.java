package com.iteso.observer.subject.impl;

import java.util.ArrayList;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subject.iSubject;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject{

	ArrayList<iObserver> observers;


    public SWDP2016(){
    	observers= new ArrayList<iObserver>(15);
       
    }


	public void registerObserver(iObserver observer) {
		observers.add(observer);
		
	}

	public void removeObserver(iObserver observer) {
		observers.remove(observer);
		
		
	}

	public void notifyObservers(String message) {
		
		
	}
}
