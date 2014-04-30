package com.gestioneconferenzews.ext.jars.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.gestioneconferenzews.ext.IAdapterExternal;
import com.gestioneconferenzews.ext.ProvaAdaptee;

public class AdapterTest 
{
	public boolean callMethod() throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ClassLoader myClassLoader = ClassLoader.getSystemClassLoader();
		IAdapterExternal adat = new ProvaAdaptee();
		List<String> lista = adat.getOperazioni();
		String metodo0 = lista.get(0);
		
		
		
			Class aClass = myClassLoader.loadClass(adat.getClassName());
			Object oggetto = aClass.newInstance();
			Method method;
			method = aClass.getMethod(metodo0);
		    method.invoke(oggetto);
		
		    return true;
		
		
	}
}
