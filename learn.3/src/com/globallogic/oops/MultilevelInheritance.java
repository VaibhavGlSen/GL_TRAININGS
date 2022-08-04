//multilevel inheritance

package com.globallogic.oops;

class Animal{
	
	public void eat(){
		System.out.println("eating");
	}
}
class Dog extends Animal{
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void bark(){
		System.out.println("barking");
	}
}
class puppy extends Dog{
	
	public void sleep(){
		System.out.println("sleeping");
	}
	
	
}

public class MultilevelInheritance {
	
	public static void main(String[] args) {
		puppy p = new puppy();
		p.bark();
		p.eat();
		p.sleep();
		
	}

}
