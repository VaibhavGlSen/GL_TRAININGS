package com.globallogic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer{
public static void main(String[] args) {
	
	Consumer<Integer> display=a->System.out.println(a);
	
	display.accept(10);
	
	Consumer<List<Integer>> modify=list->{
		for(int i=0;i<list.size();i++)
			list.set(i, 2+list.get(i));
		
	};
	
	Consumer<List<Integer>> dispList=list->list.stream().forEach(System.out::println);
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	modify.andThen(dispList).accept(list);
	
	
	
	
		
		
		
	}

}
