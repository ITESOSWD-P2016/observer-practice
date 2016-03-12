package com.iteso.observer;

import static org.junit.Assert.assertEquals;

import javax.naming.directory.InvalidAttributesException;

import org.junit.Before;
import org.junit.Test;

import com.iteso.observer.observers.impl.Alejandra;
import com.iteso.observer.observers.impl.Alexa;
import com.iteso.observer.observers.impl.Rene;
import com.iteso.observer.observers.impl.Sabino;
import com.iteso.observer.subjects.impl.SWDP2016;

public class AlejandraTest {
	Alejandra oAlejandra;

	@Before
	public void setUp() {
		oAlejandra = new Alejandra();
	}

	@Test
	public void testSetLastMessage() {
		oAlejandra.setLastMessage("Mensaje");
		assertEquals("Mensaje", oAlejandra.getLastMessage());
	}
	
	@Test
	public void testSendMessageToAlexa() {
		Alexa oAlexa = new Alexa();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oAlexa);
		
		oAlejandra.sendMessage("Hola Alexa");
		assertEquals("Hola Alexa", oAlexa.getLastMessage());
	}
	
	@Test
	public void testSendMessageToRene() throws InvalidAttributesException {
		Rene oRene = new Rene();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oRene);
		
		oAlejandra.sendMessage("Hola Alexa");
		assertEquals("something different", oRene.getLastMessage());
	}
	
	@Test
	public void testSendMessageToSabino() throws InvalidAttributesException {
		Sabino oSabino = new Sabino();
		SWDP2016 oSubject;
		oSubject = new SWDP2016();
		oSubject.registerObserver(oSabino);
		
		oAlejandra.sendMessage("Hola Alexa");
		assertEquals("ignore message ask again", oSabino.getLastMessage());
	}
}
