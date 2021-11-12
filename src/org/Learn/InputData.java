package org.Learn;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.testng.annotations.DataProvider;

public class InputData<E> {

	@DataProvider(name="data")
	public Object[][] getInputdata(){
		
		HashMap<String, String> data = new HashMap();
		data.put("UserName", "Ramesh122");
		data.put("Password", "ram1231");
		
		Object[][] obj  = new Object[1][1];
		
		obj[0][0] = data;
		
		return obj;
	}
	
	@DataProvider
	public Iterator<E> getInputdata1(){
		List<Employee> employees = new ArrayList();
		employees.add(new Employee(1,669917l,"rames"));
		employees.add(new Employee(1,669917l,"rames1"));
		Iterator<E> iterator = (Iterator<E>) employees.iterator();
		return iterator;
	
	}
	
	@Test(dataProvider = "data")
	public void testGetInputData(HashMap<String, String>strData) {
		System.out.println(strData.get("UserName"));
		System.out.println(strData.get("Password"));
		
	}
	
	@DataProvider(name="BothData")
	 public static Object[][] BothCaseData(){
	  Object detail[][] = null; 
	  return detail;
	  
	}

}
