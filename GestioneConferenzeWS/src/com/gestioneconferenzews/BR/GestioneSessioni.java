package com.gestioneconferenzews.BR;

import com.gestioneconferenzews.DAO.model.Persona;
import com.gestioneconferenzews.DAO.model.Sessione;

/**
 * @author PortatileTiz
 *La classe permette di gestire le Sessioni delle conferenze
 */
public class GestioneSessioni 
{
	
	/**Costruttore della classe
	 * 
	 */
	public GestioneSessioni()
	{
		
	}
	
	/**Metodo utile a creare una nuova sessione
	 * @param sessione
	 * @return boolean
	 */
	public boolean nuovasessione(Sessione sessione)
	{
		
		return true;
	}
	
	/**Metodo utile a modificare una sessione
	 * @param sessione
	 * @return boolean
	 */
	public boolean modificasessione(Sessione sessione)
	{
		
		return true;
	}
	
	/**Metodo utile ad eliminare una sessione
	 * @param sessione
	 * @return
	 */
	public boolean cancellasessione(Sessione sessione)
	{
		
		return true;
	}
	
	/**Metodo utile ad aggiungere un partecipante ad una sessione
	 * @param persona
	 * @param sessione
	 * @return
	 */
	public boolean addpartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	/**Metodo utile a rimuovere un partecipante da una sessione
	 * @param persona
	 * @param sessione
	 * @return boolean
	 */
	public boolean removepartecipante(Persona persona, Sessione sessione)
	{
		return true;
	}
	
	/**Metodo utile ad avere la totalità dei partecipanti ad una sessione
	 * @param cd_sessione
	 * @return
	 */
	public DatiSessione getpartecipantisessione(int cd_sessione)
	{
		return new DatiSessione();
	}
	
	public boolean promuoviSessionChair(Sessione sessione, Persona persona)
	{
		return true;
	}
	
	public boolean rimuoviSessionChair(Sessione sessione, Persona persona)
	{
		return true;
	}
	
	
	
}
