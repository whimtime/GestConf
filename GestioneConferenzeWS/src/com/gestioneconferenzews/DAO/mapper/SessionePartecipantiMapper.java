package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.SessionePartecipanti;
import com.gestioneconferenzews.DAO.model.SessionePartecipantiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionePartecipantiMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int countByExample(SessionePartecipantiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByExample(SessionePartecipantiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdSessionePartecipanti);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insert(SessionePartecipanti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int insertSelective(SessionePartecipanti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	List<SessionePartecipanti> selectByExample(
			SessionePartecipantiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	SessionePartecipanti selectByPrimaryKey(Integer cdSessionePartecipanti);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") SessionePartecipanti record,
			@Param("example") SessionePartecipantiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByExample(@Param("record") SessionePartecipanti record,
			@Param("example") SessionePartecipantiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKeySelective(SessionePartecipanti record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sessione_partecipanti
	 * @mbggenerated  Fri Apr 25 11:55:32 CEST 2014
	 */
	int updateByPrimaryKey(SessionePartecipanti record);
}