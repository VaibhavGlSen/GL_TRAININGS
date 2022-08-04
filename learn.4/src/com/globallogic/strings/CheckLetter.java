//Write a program to check if the letter 'e' is present in the word 'Umbrella'.

package com.globallogic.strings;

public class CheckLetter {
	public static void main(String[] args) {
		String a ="Umbrella";
		boolean p=false;
		
		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='e'){
				p=true;
				break;
			}
		
	}
		System.out.println(p);
		System.err.println(a.contains("e"));
	}
}
