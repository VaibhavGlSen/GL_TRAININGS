//Single inheritance
package com.globallogic.oops;

class A{
	int id;
	String name;
	
	public void A(int id){
		this.id=id;
	}
	
	public void A(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	
	public void printA(){
		System.out.println("A parent class");
	}
}

class B extends A{
	
	public void printB(){
		System.out.println("B child class");
		super.id=id;
		super.name=name;
		System.out.println(id+name);
	}
}

public class myInheritance {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b.printA();
		b.printB();
	}

}
