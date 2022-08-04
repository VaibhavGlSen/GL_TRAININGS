/*Create A set with all the implanatation with user defined class employee and 
 * perform the insert delete and searching and sorting
*/
package com.globallogic.List;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int id;
	String name;
	double salary;
}

public class MySet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	Set<Employee> emp=new HashSet<Employee>();
	
	lp : while(true) // labeling the while loop
    {
        System.out.println("Make your choice: ");  
         int ch = sc.nextInt(); // reading user's choice
         switch(ch)
         {
         case 1:sc.nextLine();
        	 System.out.println("Enter the id");
        	int id=sc.nextInt();
        	
        	System.out.println("Enter the name");
        	String name=sc.nextLine();
        	sc.nextLine();
        	System.out.println("Enter salary");
        	double salary=sc.nextDouble();
        	
        	emp.add(new Employee(id,name,salary)); 
        	System.out.println("Details added");
        	break;
         case 2:sc.nextLine();
        	 System.out.println("Enter the name to be deleted");
        	 String name1=sc.nextLine();
        	 for(Employee e:emp){
        		 if(e.getName().equalsIgnoreCase(name1)){
        			 emp.remove(e);
        		 }
        		 
        		 System.out.println(emp);
        	 }
	
	}      
		
    
}}}
