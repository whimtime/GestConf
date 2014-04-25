package com.gestioneconferenzews.DAO.mapper;

import com.gestioneconferenzews.DAO.model.CodaFatturazione;
import com.gestioneconferenzews.DAO.model.CodaFatturazioneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodaFatturazioneMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int countByExample(CodaFatturazioneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int deleteByExample(CodaFatturazioneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int deleteByPrimaryKey(Integer cdCodaFatturazione);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int insert(CodaFatturazione record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int insertSelective(CodaFatturazione record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	List<CodaFatturazione> selectByExample(CodaFatturazioneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	CodaFatturazione selectByPrimaryKey(Integer cdCodaFatturazione);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int updateByExampleSelective(@Param("record") CodaFatturazione record,
			@Param("example") CodaFatturazioneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int updateByExample(@Param("record") CodaFatturazione record,
			@Param("example") CodaFatturazioneExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int updateByPrimaryKeySelective(CodaFatturazione record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table coda_fatturazione
	 * @mbggenerated  Thu Apr 24 10:04:48 CEST 2014
	 */
	int updateByPrimaryKey(CodaFatturazione record);

	List<CodaFatturazione> selectCodaElaborazione();
}