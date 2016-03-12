package com.iteso.observers.Subject;

import com.iteso.observers.Observers.iObserver;

import java.util.ArrayList;

/**
 * Created by Flaveyro´sDell on 11/03/2016.
 */
public interface iSubject {

    ArrayList<iObserver> listObservers = new ArrayList<iObserver>();

    public boolean addObserver(iObserver Observer);
    public boolean deleteObserver(iObserver Observer);
}
