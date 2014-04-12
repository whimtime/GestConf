package com.gestioneconferenzews.BR;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.gestoreConnessioni;
import com.gestioneconferenzews.DAO.mapper.ContattoMapper;
import com.gestioneconferenzews.DAO.mapper.PersonaMapper;
import com.gestioneconferenzews.DAO.mapper.UtenteMapper;
import com.gestioneconferenzews.DAO.model.Contatto;
import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.PersonaExample;
import com.gestioneconferenzews.DAO.model.Utente;
import com.gestioneconferenzews.DAO.model.UtenteExample;
import com.gestioneconferenzews.DAO.model.UtenteExample.Criteria;
import com.gestioneconferenzews.common.SendMail;

public class GestioneUtenti 
{
	public GestioneUtenti()
	{
		
	}	
	
	public boolean VerificaAccesso(String username, String password)
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
		SqlSession session = gestoreConnessioni.getConnection(logger);
		
		UtenteMapper mapperUtente = session.getMapper(UtenteMapper.class);
		
		UtenteExample esempio = new UtenteExample();
		
		logger.info("dopo example");
		Criteria cr = esempio.createCriteria();
		cr.andUsernameEqualTo(username);
		cr.andPasswordEqualTo(password);
		esempio.or(cr);
		List<Utente> utente = mapperUtente.selectByExample(esempio);
		logger.info("select eseguita");
		if(utente.size()>0)
			{
			logger.info("return true;");
			return true;
			}
		logger.info("return false");
		return false;
		
		
		}catch(Exception er)
		{
			return false;
		}
		
	}

	

	public boolean nuovoutente(Utente utente, Persona persona, Contatto contatto) throws Exception
	{
		//prima creo la persona
	   SqlSession session=null;
		Logger logger= Logger.getLogger("com.foo");
		try{
			 session = gestoreConnessioni.getConnection(logger);
		PersonaMapper mapperPersona= session.getMapper(PersonaMapper.class);	
		
		logger.info("inserisco la persona");
		
		int righePersona = mapperPersona.insert(persona);
		if(righePersona==0) throw new Exception("Errore durante la creazione della persona");
		
		//recupero la chiave appena creata
		PersonaExample pex= new PersonaExample();
		com.gestioneconferenzews.DAO.model.PersonaExample.Criteria c = pex.createCriteria();
		
		c.andCodiceFiscaleEqualTo(persona.getCodiceFiscale());
		pex.or(c);
		
		List<Persona>  persTemp = mapperPersona.selectByExample(pex);
		
		//prendo il primo
		
		int chiavePersona = persTemp.get(0).getCdPersona();
		logger.info("creata persona " + chiavePersona);
		//ora creo l'utenza
		
		UtenteMapper mapperUtente = session.getMapper(UtenteMapper.class);
		
		utente.setCdPersona(chiavePersona);
		mapperUtente.insert(utente);
		logger.info("inserisco la utenza");
		
		
		//creo il contatto base (la mail)
		ContattoMapper mapperContatto = session.getMapper(ContattoMapper.class);
		contatto.setCdPersona(chiavePersona);
		mapperContatto.insert(contatto);
		
		
		session.commit();
		
		//invio mail per conferma
		String testoMail="";
		testoMail= "Benvenuto nel sistema di gestione conferenze\n";
		testoMail += "Clicca qui per confermare la tua mail\n";
		testoMail += "http://localhost:8090/GestioneConferenzews/AccettazioneMail?username=" + utente.getUsername() + "&azione=conferma";
		SendMail mail = new SendMail("info@gestioneconferenze.com","tiziano.interlandi@gmail.com","Nuova Utenza",testoMail);

		return true;
		
		}catch(Exception er)
		{
			session.rollback();
			throw er;
		}
		
			
	}

	public DatiPersona getPersoneTutte()
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			SqlSession session = gestoreConnessioni.getConnection(logger);
		
		PersonaMapper mapperPersona = session.getMapper(PersonaMapper.class);
		
		List<Persona> lista= mapperPersona.selectPersonaTutte();
		DatiPersona perso= new DatiPersona();
		perso.setLista(lista);
		return perso;
		
		
		
		
		}catch(Exception er)
		{
			return null;
		}
		
	}
}
