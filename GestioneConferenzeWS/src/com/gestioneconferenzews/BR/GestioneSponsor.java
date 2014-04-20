package com.gestioneconferenzews.BR;

import java.util.List;

import com.gestioneconferenzews.DAO.model.*;

/**
 * @author PortatileTiz
 * La classe permette di gestire gli Sponsor.
 */
public class GestioneSponsor 
{
	
	/**
	 * Costruttore di classe
	 */
	public GestioneSponsor()
	{
		
	}
	
	
	/**Metodo che permette di ottenere la lista degli sponsor
	 * @return List<Sponsor>
	 */
	public List<Sponsor> getsponsors()
	{
		return null;
	}
	
	/**Il metodo permette di aggiungere un nuovo sponsor
	 * @param sponsor
	 * @return boolean
	 */
	public boolean addsponsor(Sponsor sponsor)
	{
		return true;
	}
	
	/**Il metodo permette di rimuovere uno sponsor dal db
	 * @param sponsor
	 * @return
	 */
	public boolean removesponsor(Sponsor sponsor)
	{
		return true;
	}
	
	
}
