package com.gestioneconferenzews.datistatici;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.mapper.ComuneIstatMapper;
import com.gestioneconferenzews.DAO.mapper.ProvinciaMapper;
import com.gestioneconferenzews.DAO.mapper.RegioneMapper;
import com.gestioneconferenzews.DAO.mapper.UtenteMapper;
import com.gestioneconferenzews.DAO.model.ComuneIstat;
import com.gestioneconferenzews.DAO.model.Provincia;
import com.gestioneconferenzews.DAO.model.Regione;

public class GestioneGeografia 
{
	public GestioneGeografia()
	{
		
	}
	
	
	public DatiGeografici getDati()
	{
		Logger logger= Logger.getLogger("com.foo");
		DatiGeografici datiRest= new DatiGeografici();
		try{
		//eseguo la query sulla tabella utenti
		String resource = "C:\\impostazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		logger.info("dopo reader");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		RegioneMapper mapper_regione = session.getMapper(RegioneMapper.class);
		List<Regione> regione =  mapper_regione.selectRegioniTutte();
	    
		datiRest.setRegioni(regione);
		
		
		ProvinciaMapper mapper_provincia = session.getMapper(ProvinciaMapper.class);
		List<Provincia> provincia =  mapper_provincia.selectProvinceTutte();
	    
		datiRest.setProvince(provincia);
		
		ComuneIstatMapper mapper_comune = session.getMapper(ComuneIstatMapper.class);
		List<ComuneIstat> comune =  mapper_comune.selectComuniTutti();
	    
		datiRest.setComuni(comune);
		
		
	
		return datiRest;
		
		}catch(Exception er)
		{
			return null;
		}
	}

}
