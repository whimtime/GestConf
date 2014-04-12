package com.gestioneconferenzews.BR;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.gestioneconferenzews.DAO.gestoreConnessioni;
import com.gestioneconferenzews.DAO.mapper.ConferenzaMapper;
import com.gestioneconferenzews.DAO.mapper.StrutturaConvenzionataMapper;
import com.gestioneconferenzews.DAO.model.*;

public class GestioneHotel 
{
	
	public GestioneHotel()
	{
		
	}
	
	public DatiHotel getHotelTutti()
	{
		Logger logger= Logger.getLogger("com.foo");
		try{
			
		    DatiHotel datiRest= new DatiHotel();
		    SqlSession session = gestoreConnessioni.getConnection(logger);
			StrutturaConvenzionataMapper mapperStrutture = session.getMapper(StrutturaConvenzionataMapper.class);
			
			List<StrutturaConvenzionata> strutture = mapperStrutture.selectStruttureTutte();
			
			datiRest.setHotels(strutture);
			
			return datiRest;
			
			
			
		
		}catch(Exception er)
		{
			logger.fatal(er.getMessage());
			return null;
		}
		
	}

	public boolean effettuaPrenotazione(StrutturaConvenzionata struttura, Persona persona, Date datainizio, Date datafine)
	{
		IPrenotazione prenotazione = getPrenotazioneObject(struttura);				
		return prenotazione.effettuaPrenotazione(struttura, persona, datainizio, datafine);	
	}
	
	public boolean cancellaPrenotazione(int cd_prenotazione, StrutturaConvenzionata struttura)
	{
		IPrenotazione prenotazione = getPrenotazioneObject(struttura);		
		return prenotazione.cancellaPrenotazione(cd_prenotazione);
	}
	
	public boolean modificaPrenotazione(StrutturaConvenzionata struttura, Persona persona, Date datainizio, Date datafine) 
	{
	
		IPrenotazione prenotazione = getPrenotazioneObject(struttura);	
		PrenotazioneStrategy strategia= new PrenotazioneStrategy();
		strategia.setStrategiaPrenotazione(prenotazione);;
		return strategia.modificaPrenotazione(struttura, persona, datainizio, datafine);
	}
	

	private IPrenotazione getPrenotazioneObject(StrutturaConvenzionata struttura) {
		IPrenotazione prenotazione= null;
		
		if(struttura.getTipoServizio().equals("SERVLET"))
		{
			prenotazione= new PrenotazioneServlet();
		}
		if(struttura.getTipoServizio().equals("SOAP.NET"))
		{
			prenotazione= new PrenotazioneSOAPNet();
		}
		if(struttura.getTipoServizio().equals("SOAP.JAVA"))
		{
			prenotazione= new PrenotazioneSOAPJava();
		}
		return prenotazione;
	}
}
