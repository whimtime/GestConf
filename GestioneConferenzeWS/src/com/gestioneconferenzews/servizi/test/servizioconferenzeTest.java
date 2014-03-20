package com.gestioneconferenzews.servizi.test;

import static org.junit.Assert.*;

import com.gestioneconferenzews.BR.DatiConferenze;
import com.gestioneconferenzews.BR.GestioneConferenze;
import com.gestioneconferenzews.DAO.model.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class servizioconferenzeTest {

	@Test
	public void testSalvanuovaconferenza() {
		
		Conferenza conferenza= new Conferenza();
		conferenza.setCdComuneIstat("AG001");		
		conferenza.setDataInizio(new Date());								
		conferenza.setDataFine(new Date());		
		conferenza.setIndirizzo("via di prova 1");
		conferenza.setNome("titolo 1");
		conferenza.setSottotitolo("sottotitolo 1");
		
		GestioneConferenze obj = new GestioneConferenze();
		assertTrue(obj.salvaconferenza(conferenza));
		
	}
	
	@Test
	public void testElencoConferenze()
	{
		GestioneConferenze obj= new GestioneConferenze();
		DatiConferenze dati = obj.getconferenze();
		String s="";
	}

}
