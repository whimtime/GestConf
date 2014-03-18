package com.gestioneconferenzews.datistatici;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.mapper.CompetenzaMapper;
import com.gestioneconferenzews.DAO.mapper.RegioneMapper;
import com.gestioneconferenzews.DAO.model.Competenza;
import com.gestioneconferenzews.DAO.model.Regione;

public class CompetenzeVal {
	
	public DatiCompetenza getDati()
	{
		Logger logger= Logger.getLogger("com.foo");
		DatiCompetenza datiRest = new DatiCompetenza();
		try{
		//eseguo la query sulla tabella utenti
		String resource = "C:\\impostazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		logger.info("dopo reader");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		CompetenzaMapper mapper_comp = session.getMapper(CompetenzaMapper.class);
		List<Competenza> competenza =  mapper_comp.selectCompetenzeTutte();
	    
		datiRest.setCompetenze(competenza);
		return datiRest;
		
		}catch(Exception er)
		{
			return null;
		}

}
}
