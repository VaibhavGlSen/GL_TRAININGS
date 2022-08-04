//create a lambda to print the hello world

package com.globallogic.lambda;

interface HelloWorld{
	public void sayHello();
}

public class HelloWorldLambda {
	public static void main(String[] args) {
		HelloWorld helloworld=()->{
			System.out.println("Hello World");
			
		};
		
		helloworld.sayHello();
		
	}

}
