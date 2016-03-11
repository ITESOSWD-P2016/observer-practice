package com.iteso.observer.subjects.impl;

import com.iteso.observer.observers.iObserver;
import com.iteso.observer.subjects.iSubject;

/**
 * Created by rvillalobos on 3/10/16.
 */
public class SWDP2016 implements iSubject {
	
	public boolean registerObserver(iObserver oObserver) {
		return listObservers.add(oObserver);
	}

	public boolean removeObserver(iObserver oObserver) {
		return listObservers.remove(oObserver);
	}
	
	public static void notifyObservers(String sMessage) {
		for (iObserver o : listObservers)
			o.setLastMessage(sMessage);
	}
}
