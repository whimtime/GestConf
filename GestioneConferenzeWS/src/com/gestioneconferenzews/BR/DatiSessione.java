package com.gestioneconferenzews.BR;
import java.util.List;

import com.gestioneconferenzews.DAO.model.*;

public class DatiSessione 
{
	List<Sessione> sessioni;
	List<SessionePartecipanti> sessionipartecipanti;

	public List<SessionePartecipanti> getSessionipartecipanti() {
		return sessionipartecipanti;
	}

	public void setSessionipartecipanti(
			List<SessionePartecipanti> sessionipartecipanti) {
		this.sessionipartecipanti = sessionipartecipanti;
	}

	public List<Sessione> getSessioni() {
		return sessioni;
	}

	public void setSessioni(List<Sessione> sessioni) {
		this.sessioni = sessioni;
	}
}
