package com.iteso.observerpattern;

import com.iteso.observerpattern.ObserverTests.impl.Alejandra;
import com.iteso.observerpattern.ObserverTests.impl.Cristhian;
import com.iteso.observerpattern.ObserverTests.impl.Luis;
import com.iteso.observerpattern.Subject.impl.SWDP2016;

/**
 * Created by lnvitado on 11/03/2016.
 */
public class TestMain {

    public static void main( String[] args ){
        SWDP2016 slackGroup;
        slackGroup = new SWDP2016();

        Cristhian criss = new Cristhian(slackGroup, "Criss");
        Luis luis = new Luis(slackGroup, "Luis");
        Alejandra ale = new Alejandra(slackGroup, "Alejandra");



        criss.sendMessage("Test Message");
        ale.tellMeSomething("complains");


    }

}
