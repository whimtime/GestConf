package com.gestioneconferenzews.DAO.model;

public class Ruolo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ruolo.cd_ruolo
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	private Integer cdRuolo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ruolo.descrizione
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	private String descrizione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ruolo.id_padre
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	private Integer idPadre;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ruolo.cd_ruolo
	 * @return  the value of ruolo.cd_ruolo
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public Integer getCdRuolo() {
		return cdRuolo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ruolo.cd_ruolo
	 * @param cdRuolo  the value for ruolo.cd_ruolo
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setCdRuolo(Integer cdRuolo) {
		this.cdRuolo = cdRuolo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ruolo.descrizione
	 * @return  the value of ruolo.descrizione
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ruolo.descrizione
	 * @param descrizione  the value for ruolo.descrizione
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ruolo.id_padre
	 * @return  the value of ruolo.id_padre
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public Integer getIdPadre() {
		return idPadre;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ruolo.id_padre
	 * @param idPadre  the value for ruolo.id_padre
	 * @mbggenerated  Tue Mar 18 22:25:59 CET 2014
	 */
	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}
}