package com.globallogic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;



public class MyStream {
	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<Integer>();
		
		num.add(178);
		num.add(-56);
		num.add(100);
		num.add(0);
		num.add(-8);
		num.add(-12);
		num.add(-900);
		num.add(900);
		
		//List<Integer> posNum=num.stream().filter(e->e>0).collect(Collectors.toList());
		//System.out.println(posNum);
		//posNum.stream().forEach(System.out::println);
		
		//num.stream().sorted().forEach(System.out::println);
		
		//num.stream().filter(e->e>0).forEach(System.out::println);
		
		//num.stream().map(e->e*2).forEach(System.out::println);
		
		//num.stream().distinct().forEach(System.out::println);
		
		//num.stream().filter(e->e>0).map(e->e*2).forEach(System.out::println);
	
		//OptionalInt sum=num.stream().mapToInt(Integer::intValue).min();
		//System.out.println(sum);
		
		List<Double> squareroot=num.stream().filter(e->e>0).map(e->Math.sqrt(e)).collect(Collectors.toList());
		squareroot.stream().forEach(System.out::println);
		
	}

}
