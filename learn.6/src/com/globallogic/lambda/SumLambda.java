//create a lambda to print the sum of 1 to 10 0 number

package com.globallogic.lambda;

interface Arithmetic{
	public int Sum(int n);
}

public class SumLambda {
	public static void main(String[] args) {
		Arithmetic sum=(n)->{
			int s=0;
			for(int i=1; i<=n;i++){
				s=s+i;
			}
			return s;
		};
		
		System.out.println(sum.Sum(100));
	}

}
