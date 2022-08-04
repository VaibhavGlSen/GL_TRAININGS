package com.globallogic.loops;


class Employee extends Object{
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	private int id;
	private String name;
	private double salary;


public Employee(){    //default method
	
}

public Employee(int id,String name,double salary){  //parameterized method
	this.id=id;                                      //one variable belong to class one to method
	this.name=name;
	this.salary=salary;
}
public Employee(double salary){
	this.salary=salary;
}

public void speak(){
	System.out.println("id"+this.id);
	System.out.println("name"+this.name);
	System.out.println("salary"+this.salary);
}
}
public class myClass {
	
	public static void main(String[] args) {
		Employee sakshi = new Employee(12345);
		sakshi.speak();
		System.out.println(sakshi.toString());
		
	}

}

