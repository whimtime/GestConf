package com.gestioneconferenze.elencoConferenze;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.gestioneconferenze.conferenze.*;

public class TableBean implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1099043351499284355L;
	private List<Conferenza> conferenze;
	
	
	
	
	public TableBean() {
		conferenze = new ArrayList<Conferenza>();
		
		Conferenza c1= new Conferenza();		
		GeneraConferenzaProva(c1);		
		conferenze.add(c1);
		
		Conferenza c2= new Conferenza();		
		GeneraConferenzaProva(c2);		
		conferenze.add(c2);
		
		
		Conferenza c3= new Conferenza();		
		GeneraConferenzaProva(c3);		
		conferenze.add(c3);
		
		
		Conferenza c4= new Conferenza();		
		GeneraConferenzaProva(c4);		
		conferenze.add(c4);
	        
		Conferenza c5= new Conferenza();		
		GeneraConferenzaProva(c5);		
		conferenze.add(c5);
	        
		Conferenza c6= new Conferenza();		
		GeneraConferenzaProva(c6);		
		conferenze.add(c6);
	        
		
	}



	private void GeneraConferenzaProva(Conferenza c1) {
		String s = "03/24/2013 21:54";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		try
		{
		    Date datafine = simpleDateFormat.parse(s);
		    c1.setDataConferenzaFine(datafine);
		    
		}catch(ParseException ex)
		{
			
		}
		s = "03/21/2013 21:54";
		try
		{
		    Date datainizio = simpleDateFormat.parse(s);
		    c1.setDataConferenzaInizio(datainizio);
		    
		}catch(ParseException ex)
		{
			
		}
		
		
		c1.setLuogo("MILANO");
		c1.setNome("Agile Method");
		c1.setNumeropartecipanti(15);
		c1.setModifica("www.corriere.it?ID=NOME");
	}
	
	
	
	public List<Conferenza> getConferenze() {
		return conferenze;
	}
	
	
	
	

	
}
                    
