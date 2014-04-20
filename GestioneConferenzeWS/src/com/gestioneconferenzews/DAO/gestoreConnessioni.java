package com.gestioneconferenzews.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**Classe dedicata alla gestione della configurazione di MyBatis
 * @author PortatileTiz
 *
 */
public class gestoreConnessioni 
{
	/**Restituisce un oggetto connessione
	 * @param logger
	 * @return
	 * @throws FileNotFoundException
	 */
	public static SqlSession getConnection(Logger logger)
			throws FileNotFoundException {
		//eseguo la query sulla tabella utenti
		String resource = "C:\\impostazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		logger.info("dopo reader");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}

}
