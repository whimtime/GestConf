package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Competenza;
import com.gestioneconferenzews.DAO.model.CompetenzaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetenzaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int countByExample(CompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int deleteByExample(CompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int deleteByPrimaryKey(Integer cdCompetenza);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int insert(Competenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int insertSelective(Competenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	List<Competenza> selectByExample(CompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	Competenza selectByPrimaryKey(Integer cdCompetenza);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByExampleSelective(@Param("record") Competenza record,
			@Param("example") CompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByExample(@Param("record") Competenza record,
			@Param("example") CompetenzaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByPrimaryKeySelective(Competenza record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table competenza
	 * @mbggenerated  Wed Mar 26 22:33:53 CET 2014
	 */
	int updateByPrimaryKey(Competenza record);

	List<Competenza> selectCompetenzeTutte();
}