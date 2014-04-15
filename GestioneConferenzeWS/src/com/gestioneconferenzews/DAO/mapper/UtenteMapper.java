package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Utente;
import com.gestioneconferenzews.DAO.model.UtenteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UtenteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int countByExample(UtenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int deleteByExample(UtenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdUsername);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int insert(Utente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int insertSelective(Utente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	List<Utente> selectByExample(UtenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	Utente selectByPrimaryKey(Integer cdUsername);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") Utente record,
			@Param("example") UtenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByExample(@Param("record") Utente record,
			@Param("example") UtenteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByPrimaryKeySelective(Utente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table utente
	 * @mbggenerated  Tue Apr 15 21:14:27 CEST 2014
	 */
	int updateByPrimaryKey(Utente record);
}