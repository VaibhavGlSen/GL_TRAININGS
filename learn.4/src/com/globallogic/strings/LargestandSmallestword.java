//Write a program to find out the largest and smallest word in the string "This is an umbrella".
package com.globallogic.strings;

public class LargestandSmallestword {
	public static void main(String[] args) {
		String input="This is an umbrella";
		String[] words=input.split(" ");
		int smallWordLen=Integer.MAX_VALUE;
		int largestWordLen=0;
		String smallWord="";
		String largestWord="";
		
		for(int i=0;i<words.length;i++){
			String word=words[i];
			int len =word.length();
		
			if(len>largestWordLen){
                largestWordLen = len;
                largestWord = word;
            }
            if(len<smallWordLen) {
                smallWordLen = len;
                smallWord = word;
            }
		}
            System.out.println("Input String: " + input);
            System.out.println("Smallest Word: " + smallWord);
            System.out.println("Largest Word: " + largestWord);
        
			
		}
	}

	
