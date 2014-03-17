package com.gestioneconferenzews.datistatici.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gestioneconferenzews.datistatici.GestioneGeografia;

public class GestioneGeografiaTest {

	@Test
	public void testGetDati() 
	{
		GestioneGeografia gest= new GestioneGeografia();
		gest.getDati();
	}

}
