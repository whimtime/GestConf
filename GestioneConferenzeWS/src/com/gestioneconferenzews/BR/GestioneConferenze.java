package com.gestioneconferenzews.BR;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.mapper.ConferenzaMapper;
import com.gestioneconferenzews.DAO.mapper.UtenteMapper;
import com.gestioneconferenzews.DAO.model.Conferenza;

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
			if(righeInserite>0) return true;
			return false;
			

		}catch(Exception er)
		{
			return false;
		}
	}

}
