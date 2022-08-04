//hierarchial inheritance
package com.globallogic.oops;

class Animals{
	public void eat(){
		System.out.println("eating");
	}
	
class Dogs extends Animals{
	public void bark(){
		System.out.println("barking");
	}
}
class Cats extends Animals{
	public void sleep(){
		System.out.println("sleeping");
	}
	
}
class Cows extends Animals{
	public void walk(){
		System.out.println("walking");
	}
}
	
public class hierarchialInheritance {
	public void main(String[] args) {
		Dogs d = new Dogs();
		d.bark();
		d.eat();
		Cats c = new Cats();
		c.eat();
		c.sleep();
		Cows co = new Cows();
		co.eat();
		co.walk();
		
		
		
	}
	
}

}
	
