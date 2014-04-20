package com.gestioneconferenzews.DAO.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import com.gestioneconferenzews.DAO.mapper.ProvinciaMapper;
import com.gestioneconferenzews.DAO.mapper.RegioneMapper;
import com.gestioneconferenzews.DAO.model.Provincia;
import com.gestioneconferenzews.DAO.model.ProvinciaExample;
import com.gestioneconferenzews.DAO.model.Regione;
import com.gestioneconferenzews.DAO.model.RegioneExample;

public class MysqlDAOTest {

	@Test
	public void test() throws IOException {
		//String pathConfig = "com/gestioneconferenzews/configurazioni/mybatis-config.xml";
		//Reader reader = Resources.getResourceAsReader(pathConfig);
		
		String resource = "C:\\Users\\cg07060\\git\\GestioneConferenzeDef\\GestioneConferenzeWS\\src\\com\\gestioneconferenzews\\configurazioni\\mybatis-config.xml";
	    File file = new File(resource);
	    System.out.println(file.exists());
	    Reader reader = new FileReader(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			    
		SqlSession session = sqlSessionFactory.openSession();
		try
		{
			RegioneMapper mapper = session.getMapper(RegioneMapper.class);
		  //BlogMapper mapper = session.getMapper(BlogMapper.class);
		  //Blog blog = mapper.selectBlog(101);
		    Regione regione = mapper.selectByPrimaryKey("01");
		    
		  
		    RegioneExample exa= new RegioneExample();
		    
		    List<Regione> regiuoni = mapper.selectByExample(exa);
		    
		    
		    for(Regione r: regiuoni)
		    {
		    	String nome_regione = r.getRegione();
		    	nome_regione += " ";
		    }
		} 
		finally {
		  session.close();
		}
		
		 reader = new FileReader(resource);
		
		
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	    
		 session = sqlSessionFactory.openSession();
		
		try{
			  ProvinciaMapper mapperprov = session.getMapper(ProvinciaMapper.class);
			    ProvinciaExample provex= new ProvinciaExample();			    
			    List<String> listac= new ArrayList<String>();			    			    	
			    listac.add("01");			    			    			    			    			    
			    provex.or().andCodiceIstatRegioneIn(listac);
			    List<Provincia> prov= mapperprov.selectByExample(provex);			    			    			    			    						 
			    for(Provincia r: prov)
			    {
			    	String nome_regione = r.getProvincia();
			    	nome_regione += " ";
			    }
		}finally
		{
			
			session.close();
		}

		
	}

}
