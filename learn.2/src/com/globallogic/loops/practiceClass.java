package com.globallogic.loops;

class One{
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public int getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(int phonenum) {
		this.phonenum = phonenum;
	}
	@Override
	public String toString() {
		return "one [id=" + id + ", name=" + name + ", age=" + age + ", rollnum=" + rollnum + ", phonenum=" + phonenum
				+ "]";
	}
	private int id;
	private String name;
	private int age;
	private int rollnum;
	private int phonenum;
}

public class practiceClass {
	public static void main(String[] args) {
		One one = new One();
		
	}

}
