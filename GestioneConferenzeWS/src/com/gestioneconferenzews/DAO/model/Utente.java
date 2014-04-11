package com.gestioneconferenzews.DAO.model;

import java.util.Date;

public class Utente {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.cd_username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private Integer cdUsername;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.cd_persona
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private Integer cdPersona;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.password
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.data_creazione
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private Date dataCreazione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.data_annullamento
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private Date dataAnnullamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column utente.data_verifica
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	private Date dataVerifica;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.cd_username
	 * @return  the value of utente.cd_username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public Integer getCdUsername() {
		return cdUsername;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.cd_username
	 * @param cdUsername  the value for utente.cd_username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setCdUsername(Integer cdUsername) {
		this.cdUsername = cdUsername;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.cd_persona
	 * @return  the value of utente.cd_persona
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public Integer getCdPersona() {
		return cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.cd_persona
	 * @param cdPersona  the value for utente.cd_persona
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setCdPersona(Integer cdPersona) {
		this.cdPersona = cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.username
	 * @return  the value of utente.username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.username
	 * @param username  the value for utente.username
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.password
	 * @return  the value of utente.password
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.password
	 * @param password  the value for utente.password
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.data_creazione
	 * @return  the value of utente.data_creazione
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public Date getDataCreazione() {
		return dataCreazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.data_creazione
	 * @param dataCreazione  the value for utente.data_creazione
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.data_annullamento
	 * @return  the value of utente.data_annullamento
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.data_annullamento
	 * @param dataAnnullamento  the value for utente.data_annullamento
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column utente.data_verifica
	 * @return  the value of utente.data_verifica
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public Date getDataVerifica() {
		return dataVerifica;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column utente.data_verifica
	 * @param dataVerifica  the value for utente.data_verifica
	 * @mbggenerated  Wed Apr 09 15:54:22 CEST 2014
	 */
	public void setDataVerifica(Date dataVerifica) {
		this.dataVerifica = dataVerifica;
	}
}