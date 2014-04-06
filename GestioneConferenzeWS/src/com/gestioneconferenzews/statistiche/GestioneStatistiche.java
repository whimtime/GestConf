package com.gestioneconferenzews.statistiche;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.mapper.ElencoStatisticheMapper;
import com.gestioneconferenzews.DAO.model.ElencoStatistiche;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class GestioneStatistiche 
{
	public GestioneStatistiche()
	{
		
	}
	
	public DatiStatistiche getElencoStatistiche()
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
		
		ElencoStatisticheMapper mapper = session.getMapper(ElencoStatisticheMapper.class);
		
	    List<ElencoStatistiche> lista = mapper.selectQueryTutte();
	    
	    DatiStatistiche dati = new DatiStatistiche();
	    dati.setLista(lista);
	    return dati;
		
		}catch(Exception er)
		{
			return null;
		}
	}

	
	public SerieChart[] getStatistica(int numeroquery)
	{
		 
		 java.sql.Connection conn = null;		 
		 java.sql.Statement stmt = null;
		 try{
			 
			 DatiStatistiche dati = this.getElencoStatistiche();			 
			 List<ElencoStatistiche> query= dati.getLista();
			
			
			 String sql="";
			 for(int i= 0; i<query.size();i++)
			 {
				 if(query.get(i).getCdElencoStatistiche().equals(numeroquery)) sql = query.get(i).getQuery();
			 }
			 if(sql.equals("")) return null;
			 
			 
		      Class.forName("com.mysql.jdbc.Driver");

		      
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestconfdb","root","pippoi");

		     
		      stmt = conn.createStatement();		     
		    
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      SerieChart serie = new SerieChart();
		      Hashtable<String, Integer> lista = new Hashtable<>();
		      while(rs.next()){
		         //Retrieve by column name
		         String chiave  = rs.getString("nome");
		         int valore  = rs.getInt("valore");
		        lista.put(chiave, valore);
		      }
		     serie.setSerie(lista);
		   SerieChart[] s= new SerieChart[1];
		   s[0]= serie;
		   return s;
		   
		 }catch(Exception er)
		 {
			 String s="";
		 }
		
		return null;
		
	}

}
