package com.globallogic.oops;

class Animal{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Animal.age = age;
	}

	String name;
	
	static int age; //static used with variable
	
	static class breed{    //static
		String breed;

	
	}
	
}

public class MyStatic {
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		
		
	}

}
