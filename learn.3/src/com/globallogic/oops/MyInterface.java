package com.globallogic.oops;

interface Mobile{
	
	public void calling();
	public void sendSMS();
}

class Apple implements Mobile
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling Apple");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS apple");
		
	}
	}
class Samsung implements Mobile{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling Samsung");
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS samsung");
		
	}
	
}
public class MyInterface {
	public static void main(String[] args) {
		Apple apple=new Apple();
		apple.calling();
		apple.sendSMS();
		
		
		Mobile note=new Samsung();
		note.calling();
		note.sendSMS();
		
		Mobile newModel=new Mobile(){

			@Override
			public void calling() {
				// TODO Auto-generated method stub
				System.out.println("Calling is there");
				
			}

			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				System.out.println("SMS is there");
				
			}
			
		};
		
		newModel.calling();
		newModel.sendSMS();
		
		
	}

}
