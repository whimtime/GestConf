package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.TipoReport;
import com.gestioneconferenzews.DAO.model.TipoReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TipoReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int countByExample(TipoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int deleteByExample(TipoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int deleteByPrimaryKey(Integer cdTipoReport);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int insert(TipoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int insertSelective(TipoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    List<TipoReport> selectByExample(TipoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    TipoReport selectByPrimaryKey(Integer cdTipoReport);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int updateByExampleSelective(@Param("record") TipoReport record, @Param("example") TipoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int updateByExample(@Param("record") TipoReport record, @Param("example") TipoReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int updateByPrimaryKeySelective(TipoReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tipo_report
     *
     * @mbggenerated Thu Apr 24 10:04:48 CEST 2014
     */
    int updateByPrimaryKey(TipoReport record);
}