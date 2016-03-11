package com.iteso.observer.subject;

import java.util.ArrayList;

import com.iteso.observer.observers.iObserver;

public interface iSubject {
	
	
	public void registerObserver(iObserver observer);
	public void removeObserver(iObserver observer);
	public void notifyObservers(String observer);
	

}
