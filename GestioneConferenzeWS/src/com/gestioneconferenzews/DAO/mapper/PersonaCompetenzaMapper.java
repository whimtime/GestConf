package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.PersonaCompetenza;
import com.gestioneconferenzews.DAO.model.PersonaCompetenzaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonaCompetenzaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int countByExample(PersonaCompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int deleteByExample(PersonaCompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdPersonaCompetenza);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int insert(PersonaCompetenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int insertSelective(PersonaCompetenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	List<PersonaCompetenza> selectByExample(PersonaCompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	PersonaCompetenza selectByPrimaryKey(Integer cdPersonaCompetenza);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") PersonaCompetenza record,
			@Param("example") PersonaCompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByExample(@Param("record") PersonaCompetenza record,
			@Param("example") PersonaCompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByPrimaryKeySelective(PersonaCompetenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table persona_competenza
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByPrimaryKey(PersonaCompetenza record);
}