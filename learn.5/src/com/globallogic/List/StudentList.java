package com.globallogic.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ch;
		
		System.out.println("Enter you choice");
		System.out.println("1. Add the employee to list");
        System.out.println("2: Delete the employee from list");
        System.out.println("3: Search the employee name");
        System.out.println("4: Update the employee value using name or name");
        System.out.println("5:  Sort the data of employee");
        System.out.println("6: Provide the sum of slary of employee");
        System.out.println("7: search for highest paid salary");
        System.out.println("8: search for minimum paid salary");
        ArrayList<String> ls=new ArrayList<String>();
        ls.add("A");
        ls.add("B");
        ls.add("C");
        
       lp : while(true) // labeling the while loop
       {
           System.out.print("Make your choice: ");  
            ch = sc.nextInt(); // reading user's choice
            switch(ch)
            {
            case 1:  
            	//For adding employee
                System.out.println("add the employee");
                String n = sc.nextLine();
		        ls.add(n);
		
                System.out.println(ls);
                break;
            case 2:
            	//for deleting the emoloyee from list
            	System.out.println("Write the employee name to be deleted");
            	String s=sc.nextLine();
            	int i1=ls.indexOf(s);
            	
            	ls.remove(i1);
            	
            	System.out.println(ls);
            
            	break;
            case 3:
            	//Search the employee name
            	System.out.println("Search employee");
            	String n1=sc.next();
            	System.out.println(ls.contains(n1));
            	break;
             
            case 4:
            	//Update the meployee value using name or name
            	System.out.println("Enter the employee name to be update");
            	String o=sc.nextLine();
            	String u=sc.nextLine();
            	int j =ls.indexOf(o);
            	ls.set(j, u);
            	break;
            	
            case 5:
            	//Sort the data of employee
            	Collections.sort(ls);
            	
            case 6:
            	//Provide the sum of slary of employee
            	
	}
   }

}}
