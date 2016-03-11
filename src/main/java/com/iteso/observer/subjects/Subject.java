package com.iteso.observer.subjects;
import com.iteso.observer.observers.Observer;
public interface Subject {

	void registrarObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}

