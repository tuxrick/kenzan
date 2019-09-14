package org.kenzan.employees.api.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kenzan.employees.api.model.Employees;
import org.kenzan.employees.api.service.*;

@Path("/employees")

public class MessageResource {

	EmployeesService employeesService = new EmployeesService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employees> getEmployees() {
		
		return employeesService.getAllEmployees();
	
	}
	

	@GET
	@Path("/{employeeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employees getEmployee(@PathParam("employeeId") long id){
		//employeesService.getEmployee(employeeId);
		
		return employeesService.getEmployee(id);
		
	
	}	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employees addEmployee(Employees employee) {
		return employeesService.addEmployee(employee);
	}
	
}
