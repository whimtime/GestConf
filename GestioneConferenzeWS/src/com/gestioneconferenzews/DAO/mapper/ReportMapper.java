package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.Report;
import com.gestioneconferenzews.DAO.model.ReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int countByExample(ReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int deleteByExample(ReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int deleteByPrimaryKey(Integer cdReport);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int insert(Report record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int insertSelective(Report record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	List<Report> selectByExample(ReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	Report selectByPrimaryKey(Integer cdReport);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int updateByExampleSelective(@Param("record") Report record,
			@Param("example") ReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int updateByExample(@Param("record") Report record,
			@Param("example") ReportExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int updateByPrimaryKeySelective(Report record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table report
	 * @mbggenerated  Wed Mar 19 21:34:13 CET 2014
	 */
	int updateByPrimaryKey(Report record);
}