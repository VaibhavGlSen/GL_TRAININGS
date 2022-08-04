package com.globallogic.searchingSorting;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
	
	public static int linearSearch(List<Integer> ls,int key){
		for(int i=0;i<ls.size();i++){
			if(ls.get(i)==key){
				return i;
			}
			
		}
		return -1;
		
	}
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		
		ls.add(12);
		ls.add(14);
		ls.add(17);
		ls.add(10);
		ls.add(11);
		ls.add(15);
		
		System.out.println(ls);
		System.out.println(linearSearch(ls,17));
		
		}
		

}
