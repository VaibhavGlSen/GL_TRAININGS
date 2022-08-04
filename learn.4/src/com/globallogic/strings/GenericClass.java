//Create a Student with with 5 parameters and make this class generic
package com.globallogic.strings;

class Student<A,B,C,D,E>
{ 
	A id;
	B name;
	C rollNum;
	D marks;
	E city;
	
	Student(A id,B name,C rollNum,D marks,E city){
		this.id=id;
		this.name=name;
		this.rollNum=rollNum;
		this.marks=marks;
		this.city=city;
		
}
	
	public void print(){
		System.out.println("The id of student is "+ id);
		System.out.println("The name of student is "+ name);
		System.out.println("The rollNumber of student is "+ rollNum);
		System.out.println("The marks of student is "+ marks);
		System.out.println("The city of student is "+ city);
	}	
	
}

public class GenericClass {
	public static void main(String[] args) {
		Student<Integer,String,Integer,Integer,String> s=new Student<Integer,String,Integer,Integer,String>(1,"Sakshi",23,45,"Varanasi");
		s.print();
		
	}

}
