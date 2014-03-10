package com.gestioneconferenzews.DAO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MySQLConnection; 
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class MysqlDAO implements IDAOAccess {

	Logger logger= Logger.getLogger("com.foo");
	Connection connection = null;
	
	public MysqlDAO()
	{
		try 
		{	
			Class.forName("com.mysql.jdbc.Driver");	
		}
		catch (ClassNotFoundException e) 
		{		
			logger.info("impossibile trovare il driver mysql");		
			e.printStackTrace();		
			return;	
		}
		
		
		try {
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/gestconfdb","root", "pippoi");
	 
		} catch (SQLException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return;
		}
		
	}
	
	@Override
	public Object select(String sql, ArrayList arrayParameters) throws SQLException {
		 PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
         // setting parameter to the query
        /* statement.setInt(1, 2);
         statement.setString(2, "Dinesh");
         statement.setString(3, "MCA");
         statement.setString(4, "Patna");*/
         //Updating Query
         ResultSet result = statement.executeQuery();
         statement.close();
		return result;
	}

	@Override
	public Object insert(String sql, ArrayList arrayParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(String sql, ArrayList arrayParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object delete(String sql, ArrayList arrayParameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean openConnection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rollback() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean commit() {
		// TODO Auto-generated method stub
		return false;
	}

}
