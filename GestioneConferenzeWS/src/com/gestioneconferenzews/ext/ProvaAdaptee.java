package com.gestioneconferenzews.ext;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gestioneconferenzews.ext.jars.ProvaAdapter;

public class ProvaAdaptee implements IAdapterExternal {

	@Override
	public List<String> getOperazioni() {
		ProvaAdapter ob = new ProvaAdapter();
		Class c = ob.getClass();
	    List<String> lista = new ArrayList<String>();
		
		for(Method m : c.getDeclaredMethods())
		{
			lista.add(m.getName());
		}
		
		
		
		return lista;
	}

	@Override
	public String getClassName() {
		return "com.gestioneconferenzews.ext.jars.ProvaAdapter";
	}

	@Override
	public String getOrigine() {
		return "Dipartimento di Scienze Milano";
	}

}
