package com.gestioneconferenzews.BR.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestioneUtentiTest {

	@Test
	public void testVerificaAccesso() {
		
		boolean positiva= new com.gestioneconferenzews.BR.GestioneUtenti().VerificaAccesso("tiziano", "password");
		
		
		boolean negativa= new com.gestioneconferenzews.BR.GestioneUtenti().VerificaAccesso("pino", "password");
		
		if(positiva && !negativa)
		{
			assertTrue(true);
		}else
		{
			assertFalse(false);
		}
	}

}
