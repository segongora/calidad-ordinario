package com.mayab.calidad.mockito;

public class Alumno {
	 String name;
	 String lastName;
	 Integer ID;
	 Integer age;
	 double avg;
	
	public Alumno() {
		this.name = "";
		this.lastName = "";
		this.ID = 0000;
		this.age = 0;
		this.avg = 0.0;
	}
	
	public Alumno(String name, String lastName, Integer ID, Integer age, double avg) {
		this.name = name;
		this.lastName = lastName;
		this.ID = ID;
		this.age = age;
		this.avg = avg;
	}
	
	public void setName(String name) {this.name = name;}
	public void setLastName(String lastname) {this.lastName = lastname;}
	public void setID(Integer ID) {this.ID = ID;}
	public void setAge(Integer age) {this.age = age;}
	public void setAvg(double avg) {this.avg = avg;}
	
	public String getName() {return this.name;}
	public String getLastName() {return this.lastName;}
	public Integer getID() {return this.ID;}
	public Integer getAge() {return this.age;}
	public double getAvg() {return this.avg;}


}
