package com.gestioneconferenzews.strategieAscolto;

public class StrategyAccettazione 
{
	IStrategiaAscolto strategia=null;

	public IStrategiaAscolto getStrategia() {
		return strategia;
	}

	public void setStrategia(IStrategiaAscolto strategia) {
		this.strategia = strategia;
	}
	
	public boolean salvaAzione(Azione azione) {
		return strategia.salvaAzione(azione);
	}

}
