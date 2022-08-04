//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World"

package com.globallogic.strings;

public class OccurenceOfletter {
	public static void main(String[] args) {
		String a = "Hello, World";
		
		System.out.println( "first occurence of 'o' is at index "+a.indexOf('o'));
		System.out.println("last occurence of 'o' is at index "+ a.lastIndexOf('o'));
		System.out.println("first and last occurence of character ' ' is at index "+ a.indexOf(' ')+" and "+a.lastIndexOf(' '));
		
 }
}
