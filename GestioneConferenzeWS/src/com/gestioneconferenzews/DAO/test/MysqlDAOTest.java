package com.gestioneconferenzews.DAO.test;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.gestioneconferenzews.DAO.MysqlDAO;

public class MysqlDAOTest {

	@Test
	public void test() {
		MysqlDAO dao= new MysqlDAO();
		try {
			ResultSet result = (ResultSet) dao.select("SELECT * FROM GESTCONFDB.REGIONE", null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
