//Program to Caste Vote if age>18

package com.globallogic.helloworld;
import java.util.Scanner;

public class PracticeQue1 {
	public static void main(String[] args) {
		Scanner myObj =new Scanner(System.in);
		
		System.out.println("Enter an age");
		int age = myObj.nextInt();
		
		if(age>=18){
			System.out.println("Allowed to cast vote");
			
		}else{
			System.out.println("Not Allowed");
		}
		
	}

}
