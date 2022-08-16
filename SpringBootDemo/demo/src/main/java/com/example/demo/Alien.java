package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	 
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired           // It will search for the type 
	@Qualifier("laptop") // It will search by the name of object
	private Laptop laptop;

	public int getAid() {
		return aid;
	}
	public Alien() {
		super();
		System.out.println("object created");
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("in show");
		laptop.compile();
	}

}
