//Program to give Color code and print color name
package com.globallogic.helloworld;

import java.util.Scanner;

public class PracticeQue2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a color code");
		char color = sc.next().charAt(0);
		
		switch(color){
			
		
			case 'R':
				System.out.println("Red");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'V':
				System.out.println("Violet");
				break;
			case 'G':
				System.out.println("Green");
				break;
				default:
					System.out.println("none");
					break;
		
		}
		
	}

}
