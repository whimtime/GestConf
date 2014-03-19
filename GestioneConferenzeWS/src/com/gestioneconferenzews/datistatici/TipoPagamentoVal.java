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
import com.gestioneconferenzews.DAO.mapper.TipoPagamentoMapper;
import com.gestioneconferenzews.DAO.model.Competenza;
import com.gestioneconferenzews.DAO.model.TipoPagamento;

public class TipoPagamentoVal 
{
	public DatiTipoPagamento getDati()
	{
		Logger logger= Logger.getLogger("com.foo");
		DatiTipoPagamento datiRest = new DatiTipoPagamento();
		try{
		//eseguo la query sulla tabella utenti
		String resource = "C:\\impostazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		logger.info("dopo reader");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		TipoPagamentoMapper mapper_tipo = session.getMapper(TipoPagamentoMapper.class);
		List<TipoPagamento> tipopag =  mapper_tipo.selectTipoPagamentiTutti();
	    
		datiRest.setTipopag(tipopag);
		return datiRest;
		
		
		}catch(Exception er)
		{
			return null;
		}

}
}
