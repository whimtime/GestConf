package com.gestioneconferenzews.BR.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.gestioneconferenzews.BR.GestioneUtenti;
import com.gestioneconferenzews.DAO.model.Contatto;
import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.Utente;

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

	@Test
	public void testNuovoUtente()
	{
		//creo la persona
		Persona persona= new Persona();
		persona.setCdComuneIstatNascita("MI146");
		persona.setCdPersona(0);;
		persona.setCodiceFiscale("BBRTNK89G3F05T");
		persona.setCognome("ROSSI");
		persona.setNome("MARIO");
		persona.setDataNascita(new Date());
		
		//creo l'utenza
		Utente utenza= new Utente();
		utenza.setCdPersona(0);
		utenza.setCdUsername(0);
		utenza.setPassword("password");
		utenza.setUsername("m.rossi");
		
		//creo il contatto mail
		Contatto contatto= new Contatto();
		contatto.setCdContatto(0);
		contatto.setCdPersona(0);
		contatto.setContatto("m.rossi@gmail.com");
		contatto.setTipo("MAIL");
		
		GestioneUtenti servizio= new GestioneUtenti();
		try {
			assertTrue(servizio.nuovoutente(utenza, persona, contatto));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
