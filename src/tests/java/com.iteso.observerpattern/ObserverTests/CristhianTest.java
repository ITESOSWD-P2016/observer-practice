package com.iteso.observerpattern.ObserverTests;

import com.iteso.observerpattern.ObserverTests.impl.Cristhian;
import com.iteso.observerpattern.ObserverTests.impl.Rodrigo;
import com.iteso.observerpattern.Subject.iSubject;
import com.iteso.observerpattern.Subject.impl.SWDP2016;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CristhianTest {
    Cristhian criss;
    Rodrigo rodrigo;
    SWDP2016 chatgroup;
    ArrayList observersList;

    @Before
    public void setUp(){
        chatgroup = new SWDP2016();

        criss = new Cristhian(chatgroup, "Criss");
        rodrigo = new Rodrigo(chatgroup, "Rodrigo");

        observersList = new ArrayList();
    }

    // Envia Mensajes al Grupo
    @Test
    public void testSendMessageToGroup(){
        criss.sendMessageToChat("@rodrigo!");
        assertEquals("@rodrigo!",chatgroup.getMessage());
    }

    // Envia Mensajes a otro Usuario
    @Test
    public void testSendMessageToUser(){
        criss.sendMessageToChat("@rodrigo!");
        assertEquals("@rodrigo!",rodrigo.getLastMessage());
    }

    // Recibe Mensajes del Grupo
    @Test
    public void testReceiveMessageFromGroup(){
        chatgroup.sendMessage("@criss!");
        assertEquals("@criss!",criss.getLastMessage());
    }

    // Recibe Mensajes de otro Usuario
    @Test
    public void testReceiveMessageFromUser(){
        rodrigo.sendMessageToChat("@criss!");
        assertEquals("@criss!",criss.getLastMessage());
    }




}
