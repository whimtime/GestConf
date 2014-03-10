package com.gestioneconferenzews.strategieAscolto;

import org.apache.log4j.Logger;

public class StrategiaAscoltoIscrizione implements IStrategiaAscolto {

	Logger logger= Logger.getLogger("com.foo");
	@Override
	public boolean salvaAzione(Azione azione) {
		// TODO Auto-generated method stub
		logger.info("chiamata strategia di iscrizione");
		return false;
	}

}
