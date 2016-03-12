package com.iteso.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.iteso.observer.observers.impl.Alexa;
import com.iteso.observer.observers.impl.Rene;
import com.iteso.observer.observers.impl.Sabino;
import com.iteso.observer.subjects.impl.SWDP2016;

public class ReneTest {
	Rene oRene;
	
	@Before
	public void setUp() {
		oRene = new Rene();
	}

	@Test
	public void testSendMessageToSabino() {
		Sabino oSabino = new Sabino();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oSabino);
		
		oRene.sendMessage("Hola a todos");
		assertEquals("ignore message ask again", oSabino.getLastMessage());
	}
	
	@Test
	public void testSetLastMessage(){
		oRene.setLastMessage("Mensaje");
		assertEquals("something different", oRene.getLastMessage());
	}
	
	@Test
	public void testSendMessageToAlexa() {
		Alexa oAlexa = new Alexa();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oAlexa);
		
		oRene.sendMessage("Hola Alexa");
		assertEquals("Hola Alexa", oAlexa.getLastMessage());
	}
	
}
