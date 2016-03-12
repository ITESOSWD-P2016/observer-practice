package com.iteso.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.observer.observers.impl.Alejandra;
import com.iteso.observer.observers.impl.Alexa;
import com.iteso.observer.observers.impl.Rene;
import com.iteso.observer.observers.impl.Sabino;
import com.iteso.observer.subjects.impl.SWDP2016;

public class AlexaTest {
	Alexa oAlexa;
	
	@Before
	public void setUp(){
		oAlexa = new Alexa();
	}

	@Test
	public void testSetLastMessage() {
		oAlexa.setLastMessage("Mensaje");
		assertEquals("Mensaje", oAlexa.getLastMessage());
	}
	
	@Test
	public void testSendMessageToSabino() {
		Sabino oSabino = new Sabino();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oSabino);
		oSubject.registerObserver(oAlexa);
		
		oAlexa.sendMessage("Hola Sabino");
		assertEquals("can you repeat?", oAlexa.getLastMessage());
	}
	
	@Test
	public void testSendMessageToRene() {
		Rene oRene = new Rene();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oRene);
		
		oAlexa.sendMessage("Hola René");
		assertEquals("something different", oRene.getLastMessage());
	}
	
	@Test
	public void testSendMessageToAlejandra() {
		Alejandra oAlejandra = new Alejandra();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oAlejandra);
		oSubject.registerObserver(oAlexa);
		
		oAlexa.sendMessage("Hola Alejandra");
		assertEquals("will you give more checkpoints for that?", oAlexa.getLastMessage());
	}
}
