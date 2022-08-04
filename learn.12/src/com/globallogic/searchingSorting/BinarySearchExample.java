package com.globallogic.searchingSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
	public static int binarySearch(List<Integer> arr,int key){
		int low=0;
		int high=arr.size()-1;
		
		while(low<=high){
			int mid=low+(high-low)/2;
			
			if(arr.get(mid)==key)
				return mid;
			
			if(arr.get(mid)<key)
				low=mid+1;
			
			else
				high=mid-1;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>ls=new ArrayList<Integer>();
		ls.add(13);
		ls.add(10);
		ls.add(19);
		ls.add(17);
		ls.add(15);
		ls.add(18);
		ls.add(20);
		
		Collections.sort(ls);
		System.out.println(ls);
		
		System.out.println(binarySearch(ls,17));
		
		System.out.println(Collections.binarySearch(ls, 18));
		

	}

}
