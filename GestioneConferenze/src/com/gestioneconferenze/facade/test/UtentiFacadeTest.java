package com.gestioneconferenze.facade.test;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.gestioneconferenze.facade.UtentiFacade;

public class UtentiFacadeTest {

	@Test
	public void testLogin() throws Exception {
		UtentiFacade client = new  UtentiFacade();
		boolean risposta_positiva = client.login("tiziano", "password");
		
		boolean risposta_negativa = client.login("pino", "password");
		assertTrue(risposta_positiva && !risposta_negativa);
	}
}
