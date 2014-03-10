package com.gestioneconferenzews.strategieAscolto;

import org.apache.log4j.Logger;

public class StrategiaAscoltoCancellazione implements IStrategiaAscolto {

	Logger logger= Logger.getLogger("com.foo");
	@Override
	public boolean salvaAzione(Azione azione) {
		// TODO Auto-generated method stub
		logger.info("chiamata strategia di cancellazione");
		return false;
	}

}
