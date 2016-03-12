package com.iteso.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.observer.observers.impl.Alejandra;
import com.iteso.observer.observers.impl.Alexa;
import com.iteso.observer.observers.impl.Rene;
import com.iteso.observer.observers.impl.Sabino;
import com.iteso.observer.subjects.impl.SWDP2016;

public class SabinoTest {
	Sabino oSabino;
	
	@Before
	public void setUp(){
		oSabino = new Sabino();
	}

	@Test
	public void testSetLastMessage() {
		oSabino.setLastMessage("Mensaje");
		assertEquals("ignore message ask again", oSabino.getLastMessage());
	}
	
	@Test
	public void testSendMessageToAlejandra() {
		Alejandra oAlejandra = new Alejandra();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oAlejandra);
		
		oSabino.sendMessage("Hola Alejandra");
		assertEquals("Hola Alejandra", oAlejandra.getLastMessage());
	}
	
	@Test
	public void testSendMessageToRene() {
		Rene oRene = new Rene();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oRene);
		
		oSabino.sendMessage("Hola René");
		assertEquals("something different", oRene.getLastMessage());
	}
	
	@Test
	public void testSendMessageToAlexa() {
		Alexa oAlexa = new Alexa();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oAlexa);
		
		oSabino.sendMessage("Hola Alexa");
		assertEquals("Hola Alexa", oAlexa.getLastMessage());
	}
}
