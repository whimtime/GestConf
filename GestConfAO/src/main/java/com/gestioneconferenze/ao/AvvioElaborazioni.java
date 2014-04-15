package com.gestioneconferenze.ao;

public class AvvioElaborazioni implements Runnable {

	public void run() {
		
		while(true)
		{
			System.out.println("Start dispatcher");
			Scheduler sched= new Scheduler();
			sched.dispatch();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
