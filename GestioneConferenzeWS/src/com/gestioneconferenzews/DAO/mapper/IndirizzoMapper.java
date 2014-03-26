package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Indirizzo;
import com.gestioneconferenzews.DAO.model.IndirizzoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndirizzoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int countByExample(IndirizzoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int deleteByExample(IndirizzoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int deleteByPrimaryKey(Integer cdIndirizzo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int insert(Indirizzo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int insertSelective(Indirizzo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	List<Indirizzo> selectByExample(IndirizzoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	Indirizzo selectByPrimaryKey(Integer cdIndirizzo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByExampleSelective(@Param("record") Indirizzo record,
			@Param("example") IndirizzoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByExample(@Param("record") Indirizzo record,
			@Param("example") IndirizzoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByPrimaryKeySelective(Indirizzo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table indirizzo
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByPrimaryKey(Indirizzo record);
}