package com.gestioneconferenze.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlUtil 
{

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
	}



	

