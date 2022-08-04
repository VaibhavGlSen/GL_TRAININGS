//Write a program to replace a given substring in a sentence with another string.
//For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, 
//the new sentence should be printed as ”A snowman with snow”.

package com.globallogic.strings;

import java.util.Scanner;

public class ReplaceSubstr {
	public static void main(String[] args) {
		
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a string ");
	String s=sc.nextLine();
	String reps=s.replace("bat","snow");
	System.out.println(reps);
	
	}
}
