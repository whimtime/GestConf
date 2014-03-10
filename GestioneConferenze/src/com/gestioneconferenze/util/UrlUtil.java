package com.gestioneconferenze.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.faces.context.FacesContext;
import javax.faces.flow.builder.ReturnBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class UrlUtil 
{

	/**
	 * @author Tiziano Interlandi
	 * @param input: String da decodificare
	 * Metodo utile per codificare una stringa 
	 * @throws UnsupportedEncodingException
	 * @return String codificata
	 * 
	 * 
	 */
	public static String EncodeUrl(String input) throws UnsupportedEncodingException
	{
		 try 
		 {
			 							 
				String encodedUrl = URLEncoder.encode(input, "UTF-8");			 						 						 
				return encodedUrl;			
				
		 } catch (UnsupportedEncodingException e) {
			 
				throw e;			 				
		 }
		 
			  
	}
	
	/**
	 * @author Tiziano Interlandi
	 * @param input: String da decodificare
	 * Metodo utile per decodificare una stringa precedentemente codificata
	 * @throws UnsupportedEncodingException
	 * @return String decodificata
	 * 
	 * 
	 */
	public static String DecodeUrl(String input) throws UnsupportedEncodingException
	{
		 try 
		 {
			 							 
			 String decodedUrl = URLDecoder.decode(input, "UTF-8");			 						 						 
			 return decodedUrl;			
				
		 } catch (UnsupportedEncodingException e) {
			 
				throw e;			 				
		 }
		 
			  
	}
	
	/**
	 * @author Tiziano Interlandi
	 * @param pagina: String contenente il nome della pagina da reindirizzare compresa di estensione
	 * Metodo utile per effettuare un redirect ad una pagina a seguito di una chiamata standard
	 * 
	 */
	public static void RedirectAPagina(String pagina) {
		Logger  logger = Logger.getLogger("com.foo");
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
		try {
			logger.info("Redirect a " + pagina);
			response.sendRedirect(pagina);
		} catch (IOException e) {
			
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	/**
	 * @author Tiziano Interlandi
	 * @param pagina: String contenente il nome della pagina da reindirizzare compresa di estensione
	 * Metodo utile per effettuare un redirect ad una pagina a seguito di una chiamata Ajax
	 * 
	 */
	public static void RedirectAjaxAPagina(String pagina) {
		Logger  logger = Logger.getLogger("com.foo");
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse)context.getExternalContext().getResponse();
		try {
			context.getExternalContext().redirect(pagina);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getRemoteAddr() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		String ipAddress = request.getHeader( "X-FORWARDED-FOR" );
		if ( ipAddress == null ) {
		    ipAddress = request.getRemoteAddr();
		    return ipAddress;
		}
		return "";
	}
	
	
	}



	

