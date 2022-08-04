//Program to calculate factorial of a number
package com.globallogic.loops;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int f=1;
		
		for(int i=1;i<=num;i++){
			f=f*i;
			
		}
		System.out.println(f);
		
	}

}
