package org.kenzan.employees.api.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kenzan.employees.api.model.*;

public class EmployeesService {

	String sDate1="31/12/1998";
	//Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
	
	public List<Employees> getAllEmployees(){
				
		Employees e1 = new Employees(1L, "Ricardo", "Jose", "Hernandez", new Date() , "active");
		Employees e2 = new Employees(2L, "Pepe", "Jose", "Hernandez", new Date(), "active");
		List<Employees> list = new ArrayList<>();
		list.add(e1); 
		list.add(e2);
		return list;
		
		
	
	}
}
