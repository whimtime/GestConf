package com.gestioneconferenzews.BR;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.mapper.ComitatoMapper;
import com.gestioneconferenzews.DAO.mapper.ComitatoPersonaMapper;
import com.gestioneconferenzews.DAO.mapper.ConferenzaMapper;
import com.gestioneconferenzews.DAO.mapper.UtenteMapper;
import com.gestioneconferenzews.DAO.model.Comitato;
import com.gestioneconferenzews.DAO.model.ComitatoPersona;
import com.gestioneconferenzews.DAO.model.ComitatoPersonaExample;
import com.gestioneconferenzews.DAO.model.Conferenza;
import com.gestioneconferenzews.DAO.model.Persona;

public class GestioneConferenze 
{	
	public GestioneConferenze()
	{
		
	}
	
	public boolean salvaconferenza(Conferenza conferenza)
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				    
			SqlSession session = sqlSessionFactory.openSession();
			
			ConferenzaMapper mapperConferenza = session.getMapper(ConferenzaMapper.class);
			
		
			
			
			int righeInserite = mapperConferenza.insert(conferenza);
			session.commit();
			
			if(righeInserite>0) return true;
			return false;
			

		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return false;
		}
	}

	
	public DatiConferenze getconferenze()
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    DatiConferenze datiRest= new DatiConferenze();
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);				   
			SqlSession session = sqlSessionFactory.openSession();			
			ConferenzaMapper mapperConferenza = session.getMapper(ConferenzaMapper.class);
			
			List<Conferenza> conferenze = mapperConferenza.selectConferenzeTutte();
			
			datiRest.setConferenze(conferenze);
			
			return datiRest;
			
			
			
		
		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return null;
		}
		
	}
	
	public Conferenza getconferenze(int cdConferenza)
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    DatiConferenze datiRest= new DatiConferenze();
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);				   
			SqlSession session = sqlSessionFactory.openSession();			
			ConferenzaMapper mapperConferenza = session.getMapper(ConferenzaMapper.class);			
			Conferenza conferenza = mapperConferenza.selectByPrimaryKey(cdConferenza);
									
			return conferenza;
											
		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return null;
		}
		
	}
	
	
	public boolean aggiornaconferenza(Conferenza conferenza)
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				    
			SqlSession session = sqlSessionFactory.openSession();
			
			ConferenzaMapper mapperConferenza = session.getMapper(ConferenzaMapper.class);
			
		
			
			
			int righeInserite = mapperConferenza.updateByPrimaryKey(conferenza);
			session.commit();
			
			if(righeInserite>0) return true;
			return false;
			

		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return false;
		}
	}

	public boolean aggiornaComitato(Comitato comitato)
	{
		return true;
	}
	
	public boolean nuovocomitato(Comitato comitato) throws Exception
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    DatiConferenze datiRest= new DatiConferenze();
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);				   
			SqlSession session = sqlSessionFactory.openSession();			
			ComitatoMapper mapperComitato = session.getMapper(ComitatoMapper.class);
			
			
			int inseriti = mapperComitato.insert(comitato);
			session.commit();
			if(inseriti!=0)return true;
			return false;
			
		}catch(Exception er)
		{
			throw er;
		}
	}

	public DatiComitati getComitatiTutti()
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    DatiConferenze datiRest= new DatiConferenze();
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);				   
			SqlSession session = sqlSessionFactory.openSession();			
			ComitatoMapper mapperComitato = session.getMapper(ComitatoMapper.class);			
			List<Comitato> comitati = mapperComitato.selectComitatiTutti();
			DatiComitati com= new DatiComitati();
			com.setComitati(comitati);
									
			return com;
											
		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return null;
		}
		
		
	}

	public boolean aggiornaComitato()
	{
		return true;
	}
	
	public boolean addPersonaComitato(ComitatoPersona comitatopersona) throws Exception
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			//eseguo la query sulla tabella utenti
			String resource = "C:\\impostazioni\\mybatis-config.xml";
		    File file = new File(resource);
		    System.out.println(file.exists());
		    DatiConferenze datiRest= new DatiConferenze();
		    Reader reader = new FileReader(resource);
			logger.info("dopo reader");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);				   
			SqlSession session = sqlSessionFactory.openSession();			
			ComitatoPersonaMapper mapperComitato = session.getMapper(ComitatoPersonaMapper.class);
			
			
			int inseriti = mapperComitato.insert(comitatopersona);
			session.commit();
			if(inseriti!=0)return true;
			return false;
			
		}catch(Exception er)
		{
			throw er;
		}
	}
	
	public boolean removePersonaComitato(ComitatoPersona comitatopersona)
	{
		return true;
	}
	
	public List<Persona> getPersoneComitato(Comitato comitato)
	{
		return null;
	}
	
}
