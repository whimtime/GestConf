package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Diplomi;
import com.gestioneconferenzews.DAO.model.DiplomiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiplomiMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int countByExample(DiplomiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int deleteByExample(DiplomiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdDiploma);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int insert(Diplomi record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int insertSelective(Diplomi record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	List<Diplomi> selectByExample(DiplomiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	Diplomi selectByPrimaryKey(Integer cdDiploma);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") Diplomi record,
			@Param("example") DiplomiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int updateByExample(@Param("record") Diplomi record,
			@Param("example") DiplomiExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int updateByPrimaryKeySelective(Diplomi record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table diplomi
	 * @mbggenerated  Fri Apr 25 11:55:33 CEST 2014
	 */
	int updateByPrimaryKey(Diplomi record);
}