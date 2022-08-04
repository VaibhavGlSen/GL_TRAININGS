package com.globallogic.oops;

class A1{
	int id;
	
public A1(int id){             //constructor
		
		this.id=id;
		
	}
	public void printA(){
		System.out.println("class A"+ id); //method
	}
}
class B1 extends A1{
	
public B1(int id) {
	super(id);          //calling the constructor of A using super keyword
		// TODO Auto-generated constructor stub
	}

	public void printB(){
		
		super.printA();        //calling the method of class A using super keyword
		System.out.println("class B"+super.id); //calling the variable of class A
	}
	
}


public class SuperKeyword {
	public static void main(String[] args) {
		B1 b=new B1(10);
		b.printA();
		b.printB();
		System.out.println(b.id);
		
	}

}
