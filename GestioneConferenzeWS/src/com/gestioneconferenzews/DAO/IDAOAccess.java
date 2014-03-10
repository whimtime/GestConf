package com.gestioneconferenzews.DAO;

import java.sql.SQLException;
import java.util.ArrayList;




public interface IDAOAccess 
{
	public Object select(String sql, ArrayList arrayParameters) throws SQLException;
	
	public Object insert(String sql, ArrayList arrayParameters)  throws SQLException;
	
	public Object update(String sql, ArrayList arrayParameters) throws SQLException;
	
	public Object delete(String sql, ArrayList arrayParameters) throws SQLException;
	
	public boolean openConnection();
	
	public boolean rollback();
	
	public boolean commit();
	
}
