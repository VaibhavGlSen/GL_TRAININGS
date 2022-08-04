//Program to give month and print month name
package com.globallogic.helloworld;

import java.util.Scanner;

public class PracticeQue3 {
	public static void main(String[] args) {
		Scanner myObj =new Scanner(System.in);
		System.out.println("Enter a month number");
		int monthNum = myObj.nextInt();
		switch(monthNum)
		{
			
			case 1:
			
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feburary");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("july");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("december");
			default:
				System.out.println("not exist");
		
		
		}
		}

}
