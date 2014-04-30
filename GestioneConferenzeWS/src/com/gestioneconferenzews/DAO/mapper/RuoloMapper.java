package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Ruolo;
import com.gestioneconferenzews.DAO.model.RuoloExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuoloMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int countByExample(RuoloExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByExample(RuoloExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdRuolo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insert(Ruolo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insertSelective(Ruolo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	List<Ruolo> selectByExample(RuoloExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	Ruolo selectByPrimaryKey(Integer cdRuolo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") Ruolo record,
			@Param("example") RuoloExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExample(@Param("record") Ruolo record,
			@Param("example") RuoloExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKeySelective(Ruolo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ruolo
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKey(Ruolo record);
}