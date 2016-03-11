package com.iteso.observer.subjects;

import java.util.ArrayList;

import com.iteso.observer.observers.iObserver;

public interface iSubject {
	
	ArrayList<iObserver> listObservers = new ArrayList<iObserver>();
	
	public boolean registerObserver(iObserver oObserver);
	public boolean removeObserver(iObserver oObserver);
	
}
