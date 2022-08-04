//Program for swapping two numbers
package com.globallogic.loops;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		int i=num1;
		num1=num2;
		num2=i;
		System.out.println("first number="+num1);
		System.out.println("second number="+num2);
		
		
	}

}
