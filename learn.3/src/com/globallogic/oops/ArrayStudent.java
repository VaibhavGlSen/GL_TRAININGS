//createa array of object of student type and create and store 10 object and print 10 object value

package com.globallogic.oops;

import java.util.Scanner;

class Student{
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int id,String name,int marks) {
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
		// TODO Auto-generated constructor stub
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	int id;
	String name;
	int marks;
	
}

public class ArrayStudent {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Student[] arrStudent=new Student[10];
		System.out.println("Enter the student data");
		for(int i=0;i<10;i++){
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			Student stu=new Student(id,name,marks);
			arrStudent[i]=stu;
		}
		for(Student s:arrStudent){
			System.out.println(s);
		}
	}

}
