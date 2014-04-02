package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Contatto;
import com.gestioneconferenzews.DAO.model.ContattoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContattoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int countByExample(ContattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int deleteByExample(ContattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdContatto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int insert(Contatto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int insertSelective(Contatto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	List<Contatto> selectByExample(ContattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	Contatto selectByPrimaryKey(Integer cdContatto);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") Contatto record,
			@Param("example") ContattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int updateByExample(@Param("record") Contatto record,
			@Param("example") ContattoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int updateByPrimaryKeySelective(Contatto record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table contatto
	 * @mbggenerated  Wed Apr 02 22:57:42 CEST 2014
	 */
	int updateByPrimaryKey(Contatto record);
}