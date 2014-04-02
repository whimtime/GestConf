package com.gestioneconferenzews.DAO.model;

import java.util.Date;

public class Conferenza {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.cd_conferenza
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private Integer cdConferenza;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.nome
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private String nome;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.sottotitolo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private String sottotitolo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.data_inizio
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private Date dataInizio;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.data_fine
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private Date dataFine;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.cd_comune_istat
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private String cdComuneIstat;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column conferenza.indirizzo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	private String indirizzo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.cd_conferenza
	 * @return  the value of conferenza.cd_conferenza
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public Integer getCdConferenza() {
		return cdConferenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.cd_conferenza
	 * @param cdConferenza  the value for conferenza.cd_conferenza
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setCdConferenza(Integer cdConferenza) {
		this.cdConferenza = cdConferenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.nome
	 * @return  the value of conferenza.nome
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.nome
	 * @param nome  the value for conferenza.nome
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.sottotitolo
	 * @return  the value of conferenza.sottotitolo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public String getSottotitolo() {
		return sottotitolo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.sottotitolo
	 * @param sottotitolo  the value for conferenza.sottotitolo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setSottotitolo(String sottotitolo) {
		this.sottotitolo = sottotitolo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.data_inizio
	 * @return  the value of conferenza.data_inizio
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public Date getDataInizio() {
		return dataInizio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.data_inizio
	 * @param dataInizio  the value for conferenza.data_inizio
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.data_fine
	 * @return  the value of conferenza.data_fine
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public Date getDataFine() {
		return dataFine;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.data_fine
	 * @param dataFine  the value for conferenza.data_fine
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.cd_comune_istat
	 * @return  the value of conferenza.cd_comune_istat
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public String getCdComuneIstat() {
		return cdComuneIstat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.cd_comune_istat
	 * @param cdComuneIstat  the value for conferenza.cd_comune_istat
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setCdComuneIstat(String cdComuneIstat) {
		this.cdComuneIstat = cdComuneIstat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column conferenza.indirizzo
	 * @return  the value of conferenza.indirizzo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public String getIndirizzo() {
		return indirizzo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column conferenza.indirizzo
	 * @param indirizzo  the value for conferenza.indirizzo
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
}