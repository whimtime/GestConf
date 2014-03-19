package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.ComuneIstat;
import com.gestioneconferenzews.DAO.model.ComuneIstatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComuneIstatMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int countByExample(ComuneIstatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int deleteByExample(ComuneIstatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int deleteByPrimaryKey(String cdComune);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int insert(ComuneIstat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int insertSelective(ComuneIstat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	List<ComuneIstat> selectByExample(ComuneIstatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	ComuneIstat selectByPrimaryKey(String cdComune);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int updateByExampleSelective(@Param("record") ComuneIstat record,
			@Param("example") ComuneIstatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int updateByExample(@Param("record") ComuneIstat record,
			@Param("example") ComuneIstatExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int updateByPrimaryKeySelective(ComuneIstat record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table comune_istat
	 * @mbggenerated  Wed Mar 19 21:34:12 CET 2014
	 */
	int updateByPrimaryKey(ComuneIstat record);

	List<ComuneIstat> selectComuniTutti();
}