//reverse a string
package com.globallogic.loops;

import java.util.Scanner;

public class reverseletter {
	public static void main(String[] args) {
		
		Scanner myObj=new Scanner(System.in);
		System.out.println("enter a string");
		String s=myObj.next();
		for(int i=s.length()-1; i>=0;i--){
			System.out.print(s.charAt(i));
		}
		
	}
	
}
