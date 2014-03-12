package com.gestioneconferenzews.BR;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gestioneconferenzews.DAO.mapper.UtenteMapper;
import com.gestioneconferenzews.DAO.model.Utente;
import com.gestioneconferenzews.DAO.model.UtenteExample;
import com.gestioneconferenzews.DAO.model.UtenteExample.Criteria;

public class GestioneUtenti 
{
	public GestioneUtenti()
	{
		
	}	
	
	public boolean VerificaAccesso(String username, String password)
	{
		try{
		//eseguo la query sulla tabella utenti
		String resource = "C:\\Users\\cg07060\\git\\GestioneConferenzeDef\\GestioneConferenzeWS\\src\\com\\gestioneconferenzews\\configurazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		
		UtenteMapper mapperUtente = session.getMapper(UtenteMapper.class);
		
		UtenteExample esempio = new UtenteExample();
		
		
		Criteria cr = esempio.createCriteria();
		cr.andUsernameEqualTo(username);
		cr.andPasswordEqualTo(password);
		esempio.or(cr);
		List<Utente> utente = mapperUtente.selectByExample(esempio);
		
		if(utente.size()>0) return true;
		return false;
		
		
		}catch(Exception er)
		{
			return false;
		}
		
	}
}
