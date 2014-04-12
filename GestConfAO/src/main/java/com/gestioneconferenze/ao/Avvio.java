package com.gestioneconferenze.ao;

public class Avvio {

	public static void main(String[] args) {
		

		
		new Thread(new ScodatoreDB()).start();

        new Thread(new AvvioElaborazioni()).start();
        
        
	}

}
