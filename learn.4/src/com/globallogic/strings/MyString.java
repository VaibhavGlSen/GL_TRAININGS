//Write a program to print a string entered by user.

package com.globallogic.strings;

import java.util.Scanner;

public class MyString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string ");
		
		String str =sc.nextLine();
		
		System.out.println("You have entered "+str);
	}

}
