package com.gestioneconferenze.Bean;

import java.util.Date;

public class personaBean 
{
	String nome;
	String cognome;
	Date datanascita;
	String codicefiscale;
	String partitaiva;
	String cdcomunenascita;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}
	public String getCodicefiscale() {
		return codicefiscale;
	}
	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}
	public String getPartitaiva() {
		return partitaiva;
	}
	public void setPartitaiva(String partitaiva) {
		this.partitaiva = partitaiva;
	}
	public String getCdcomunenascita() {
		return cdcomunenascita;
	}
	public void setCdcomunenascita(String cdcomunenascita) {
		this.cdcomunenascita = cdcomunenascita;
	}

}
