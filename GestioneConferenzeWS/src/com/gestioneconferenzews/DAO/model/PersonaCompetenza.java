package com.gestioneconferenzews.DAO.model;

import java.util.Date;

public class PersonaCompetenza {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column persona_competenza.cd_persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	private Integer cdPersonaCompetenza;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column persona_competenza.cd_persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	private Integer cdPersona;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column persona_competenza.cd_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	private Integer cdCompetenza;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column persona_competenza.data_annullamento
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	private Date dataAnnullamento;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column persona_competenza.cd_persona_competenza
	 * @return  the value of persona_competenza.cd_persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Integer getCdPersonaCompetenza() {
		return cdPersonaCompetenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column persona_competenza.cd_persona_competenza
	 * @param cdPersonaCompetenza  the value for persona_competenza.cd_persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setCdPersonaCompetenza(Integer cdPersonaCompetenza) {
		this.cdPersonaCompetenza = cdPersonaCompetenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column persona_competenza.cd_persona
	 * @return  the value of persona_competenza.cd_persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Integer getCdPersona() {
		return cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column persona_competenza.cd_persona
	 * @param cdPersona  the value for persona_competenza.cd_persona
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setCdPersona(Integer cdPersona) {
		this.cdPersona = cdPersona;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column persona_competenza.cd_competenza
	 * @return  the value of persona_competenza.cd_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Integer getCdCompetenza() {
		return cdCompetenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column persona_competenza.cd_competenza
	 * @param cdCompetenza  the value for persona_competenza.cd_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setCdCompetenza(Integer cdCompetenza) {
		this.cdCompetenza = cdCompetenza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column persona_competenza.data_annullamento
	 * @return  the value of persona_competenza.data_annullamento
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column persona_competenza.data_annullamento
	 * @param dataAnnullamento  the value for persona_competenza.data_annullamento
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}
}