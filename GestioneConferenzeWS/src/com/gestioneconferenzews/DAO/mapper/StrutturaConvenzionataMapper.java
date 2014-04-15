package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.StrutturaConvenzionata;
import com.gestioneconferenzews.DAO.model.StrutturaConvenzionataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StrutturaConvenzionataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int countByExample(StrutturaConvenzionataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int deleteByExample(StrutturaConvenzionataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdStrutturaConvenzionata);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int insert(StrutturaConvenzionata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int insertSelective(StrutturaConvenzionata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	List<StrutturaConvenzionata> selectByExample(
			StrutturaConvenzionataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	StrutturaConvenzionata selectByPrimaryKey(Integer cdStrutturaConvenzionata);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int updateByExampleSelective(
			@Param("record") StrutturaConvenzionata record,
			@Param("example") StrutturaConvenzionataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int updateByExample(@Param("record") StrutturaConvenzionata record,
			@Param("example") StrutturaConvenzionataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int updateByPrimaryKeySelective(StrutturaConvenzionata record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table struttura_convenzionata
	 * @mbggenerated  Tue Apr 15 21:14:28 CEST 2014
	 */
	int updateByPrimaryKey(StrutturaConvenzionata record);

	List<StrutturaConvenzionata> selectStruttureTutte();
}