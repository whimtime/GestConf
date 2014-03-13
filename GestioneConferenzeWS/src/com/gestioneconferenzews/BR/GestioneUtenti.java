package com.gestioneconferenzews.BR;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

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
		Logger logger= Logger.getLogger("com.foo");
		try{
		//eseguo la query sulla tabella utenti
		String resource = "C:\\Users\\cg07060\\git\\GestioneConferenzeDef\\GestioneConferenzeWS\\src\\com\\gestioneconferenzews\\configurazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		logger.info("dopo reader");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		
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
}
