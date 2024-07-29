package com._welcome.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name="nunnu")
public class Demo_Entity {

	@Id
	protected Integer id;
	protected String name;
	protected String division;
	
	public Demo_Entity( int id,String name,String division) {
		super();
		this.id=id;
		this.name=name;
		this.division=division;
	}
	public Demo_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiv() {
		return division;
	}
	public void setDiv(String division) {
		this.division = division;
	}
	
	
}
