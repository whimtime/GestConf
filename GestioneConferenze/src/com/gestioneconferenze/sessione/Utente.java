package com.gestioneconferenze.sessione;

import java.util.Date;

public class Utente 
{

	String username="";
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}




	String ipaddress="";
	String email="";	
	String password="";	
	Date dataaccesso;
	

	
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataaccesso() {
		return dataaccesso;
	}
	public void setDataaccesso(Date dataaccesso) {
		this.dataaccesso = dataaccesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utente other = (Utente) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	

	public boolean valida()
	{
		
		return true;
	}
	
}

