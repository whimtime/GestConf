package com.gestioneconferenze.Bean;

import com.gestioneconferenze.facade.ConferenzeFacade;
import com.gestioneconferenzews.servizi.Comitato;

public class comitatoBean 
{
	String nome="";
	String tipo="";
	String cdconferenza="";
	String cdcomitato="";
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCdconferenza() {
		return cdconferenza;
	}
	public void setCdconferenza(String cdconferenza) {
		this.cdconferenza = cdconferenza;
	}
	public String getCdcomitato() {
		return cdcomitato;
	}
	public void setCdcomitato(String cdcomitato) {
		this.cdcomitato = cdcomitato;
	}
	
	public void salva() throws Exception
	{
		ConferenzeFacade fc= new ConferenzeFacade();
		Comitato comitato= new Comitato();
		comitato.setCdComitato(0);
		comitato.setCdConferenza(Integer.parseInt(this.getCdconferenza()));
		comitato.setCdTipo(Integer.parseInt(this.getTipo()));
		comitato.setNome(this.getNome());
		boolean risposta = fc.nuovocomitato(comitato);
	}
	
}
