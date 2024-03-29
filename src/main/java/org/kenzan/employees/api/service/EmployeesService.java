package org.kenzan.employees.api.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.kenzan.employees.api.database.DatabaseClass;
import org.kenzan.employees.api.model.*;

public class EmployeesService {

	
	private Map<Long, Employees> employees = DatabaseClass.getEmployees();
	
	String sDate1="31/12/1998";
	//Date date1= new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
	
	public EmployeesService(){
		employees.put(1L, new Employees(1, "Ricardo", "Jose", "Hernandez", new Date() , "active"));
		employees.put(2L, new Employees(2, "Pepe", "Jose", "Hernandez", new Date() , "active"));
	}
	
	
	public List<Employees> getAllEmployees(){
		return new ArrayList<Employees>(employees.values());
	}

	
	public Employees getEmployee(long id){
		return employees.get(id);
	}	
	
	public Employees addEmployee(Employees employee){
		employee.setId(employees.size()+1);
		employees.put(employee.getId(), employee);
		return employee;
	}		
	
	public Employees updateEmployee(Employees employee){
		if(employee.getId() <= 0 ){
			return null;
		}
		employees.put(employee.getId(), employee);
		return employee;
	}		
	
	public Employees removeEmployee(long id){
		return employees.remove(id);
	}	
	
	
	
	
}
