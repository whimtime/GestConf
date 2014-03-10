package com.gestioneconferenzews.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.gestioneconferenzews.strategieAscolto.Azione;
import com.gestioneconferenzews.strategieAscolto.Azioni;
import com.gestioneconferenzews.strategieAscolto.IStrategiaAscolto;
import com.gestioneconferenzews.strategieAscolto.StrategiaAscoltoCancellazione;
import com.gestioneconferenzews.strategieAscolto.StrategiaAscoltoConfermaMail;
import com.gestioneconferenzews.strategieAscolto.StrategiaAscoltoIscrizione;

/**
 * Servlet implementation class AccettazioneMail
 */
@WebServlet(description = "servlet di ascolto per le url inviate per mail", urlPatterns = { "/AccettazioneMail" })
public class AccettazioneMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger = Logger.getLogger("com.foo");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccettazioneMail() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.info("chiamata in arrivo");
		String utente = request.getParameter("user");		
		String azione = request.getParameter("azione");
		logger.info("L utente " + utente + " ha inviato un messaggio con azione " + azione);
		//avvio della strategia
		IStrategiaAscolto strategia = null;
		Azione az = new Azione();
		az.setUsername(utente);
		
		switch(azione)
		{
			case "conferma":
				strategia = new StrategiaAscoltoConfermaMail();
				az.setAzione(Azioni.CONFERMA_MAIL);
				break;
			case "iscrizione":
				strategia = new StrategiaAscoltoIscrizione();
				az.setAzione(Azioni.ISCRIZIONE_NEWSLETTER);
				break;
			case "cancellazione":
				strategia = new StrategiaAscoltoCancellazione();
				az.setAzione(Azioni.CANCELLAZIONE_NEWSLETTER);
				break;		
				default:
					try {
						throw new Exception("azione non valida");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					logger.error("azione non presente in elenco");
					break;
		}
		
		strategia.salvaAzione(az);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
