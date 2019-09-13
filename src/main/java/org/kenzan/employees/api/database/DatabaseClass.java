package org.kenzan.employees.api.database;

import java.util.HashMap;
import java.util.Map;

import org.kenzan.employees.api.model.Employees;

public class DatabaseClass {
	private static Map<Long, Employees > employees = new HashMap<>();
	
	public static Map<Long, Employees> getEmployees(){
		return employees;
	}
	
}
