package com.gestioneconferenzews.statistiche.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gestioneconferenzews.statistiche.DatiStatistiche;
import com.gestioneconferenzews.statistiche.GestioneStatistiche;
import com.gestioneconferenzews.statistiche.SerieChart;

public class GestioneStatisticheTest {

	@Test
	public void testGetElencoStatistiche() {
		GestioneStatistiche ws= new GestioneStatistiche();
		DatiStatistiche dati =   ws.getElencoStatistiche();
	}

	@Test
	public void testGetStatistica() {
		GestioneStatistiche ws= new GestioneStatistiche();
		SerieChart[] serie = ws.getStatistica(1);
	}

}
