package com.globallogic.oops;

class Animalss{
	
	public void sound(){
		System.out.println("Animal is making sound");
	}
	public void sound(int hours){
		System.out.println("Animal is making sound from "+ hours+" hours");
	}
}

class Horse extends Animalss{
	
	public void sound(){
		System.out.println("Neigh");
	}
}

class Cat extends Animalss{
	
	public void sound(){
	System.out.println("Meow");
	}
}

public class MyPolymorph {
	
	public static void main(String[] args) {
		Animalss obj= new Animalss();
		obj.sound();
		
		obj=new Horse();    //runtime polymorphism
		obj.sound();
		
		obj=new Cat();
		obj.sound(23);
	}

}
