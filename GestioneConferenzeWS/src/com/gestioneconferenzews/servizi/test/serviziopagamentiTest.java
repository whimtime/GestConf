package com.gestioneconferenzews.servizi.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.gestioneconferenzews.DAO.model.CodaFatturazione;
import com.gestioneconferenzews.servizi.serviziopagamenti;

public class serviziopagamentiTest {

	@Test
	public void testServiziopagamenti() {
		fail("Not yet implemented");
	}

	@Test
	public void testEffettuapagamento() {
		fail("Not yet implemented");
	}

	@Test
	public void testStornapagamento() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddinvestimento() {
		fail("Not yet implemented");
	}

	@Test
	public void testStornainvestimento() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCodaDaElaborare() {
		serviziopagamenti ws= new serviziopagamenti();
		List<CodaFatturazione> lista =  ws.getCodaDaElaborare();
		if(lista.size()>0) assertTrue(true);
		assertFalse(false);
	}

	@Test
	public void testSalvaCodaElaborata() {
		serviziopagamenti ws= new serviziopagamenti();
		assertTrue(ws.salvaCodaElaborata(1));
	}

}
