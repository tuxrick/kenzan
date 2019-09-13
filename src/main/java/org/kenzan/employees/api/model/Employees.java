package org.kenzan.employees.api.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
	
	
	private long id;
	private String first_name; 
	private String middle_name; 
	private String last_name;
	private Date birth_day;
	private Date date_of_employment; 
	private String status;
	
	public Employees() {
		
	}
	
	public Employees(long id, String first_name, String middle_name, String last_name, Date birth_day, String status) {
		this.id = id; 
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name; 
		this.birth_day = birth_day; 
		this.date_of_employment = new Date();
		this.status = status;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Date getBirth_day() {
		return birth_day;
	}   
	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}
	public Date getDate_of_employment() {
		return date_of_employment;
	}
	public void setDate_of_employment(Date date_of_employment) {
		this.date_of_employment = date_of_employment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
	
	
	
}
