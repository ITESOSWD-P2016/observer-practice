package com.iteso.observerpattern.Subject;

import com.iteso.observerpattern.ObserverTests.impl.Cristhian;
import com.iteso.observerpattern.ObserverTests.impl.Josue;
import com.iteso.observerpattern.ObserverTests.impl.Rodrigo;
import com.iteso.observerpattern.Subject.impl.SWDP2016;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by lnvitado on 11/03/2016.
 */
public class SWDP2016Test {
    Cristhian criss;
    Rodrigo rodrigo;
    Josue josue;
    SWDP2016 chatgroup;
    ArrayList observersList;

    @Before
    public void setUp(){
        chatgroup = new SWDP2016();

        criss = new Cristhian();
        rodrigo = new Rodrigo();
        josue = new Josue();

        observersList = new ArrayList();
    }


    // Registra Obaservers
    @Test
    public void testRegisterObserver(){

        chatgroup.registerObserver(criss,"criss");
        chatgroup.registerObserver(rodrigo,"rodrigo");
        chatgroup.registerObserver(josue,"josue");

        observersList.add(criss);
        observersList.add(rodrigo);
        observersList.add(josue);

        assertEquals(observersList,chatgroup.getObservers());
    }


    // Remueve Obaservers
    @Test
    public void testRemoveObserver(){

        chatgroup.registerObserver(criss,"criss");
        chatgroup.registerObserver(rodrigo,"rodrigo");
        chatgroup.registerObserver(josue,"josue");

        observersList.add(criss);
        observersList.add(rodrigo);
        observersList.add(josue);

        chatgroup.removeObserver(josue);

        observersList.remove(josue);

        assertEquals(observersList,chatgroup.getObservers());
    }


    // Notifica a sus Observers
    @Test
    public void testNotifyObserver(){

        chatgroup.registerObserver(criss,"criss");
        chatgroup.registerObserver(rodrigo,"rodrigo");
        chatgroup.registerObserver(josue,"josue");

        chatgroup.sendMessage("@everyone!");

        String allmsgs = criss.getLastMessage()+rodrigo.getLastMessage()+josue.getLastMessage();

        assertEquals("@everyone!@everyone!@everyone!",allmsgs);
    }

}
