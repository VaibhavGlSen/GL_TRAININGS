//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print

package com.globallogic.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class StudentList {
	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("ravinder");
		ls.add("kumar");
		ls.add("ajay");
		ls.add("zee");
		
		
		Iterator<String > it=  ls.iterator();
		//it will check there is any next element is there or not
		//it will return true if there is any element
		//it will return false if there is not element
		
		//Collections.sort(ls);
		
		
		
		while(it.hasNext())
		{
			//String element=it.next();
			System.out.println("element is "+it.next());
		
		}

}
}
