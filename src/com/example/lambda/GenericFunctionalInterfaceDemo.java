package com.example.lambda;

//create a generic functional interface
interface SomeFunc<T>{
	
	T func(T t);
	
}

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		//user a string based version of SomeFunc function
		SomeFunc<String> reverseString = (str) -> {
			
			String result = "";
			
			for(int i = str.length()-1; i >=0; i--) {
				
				result+=str.charAt(i);
				
			}
			
			return result;
			
		};
		
		SomeFunc<Integer> factorial = (n) -> {
			
			int result = 1;
			
			for(int i = 1; i <= n; i++) {
				
				result= result * i;
				
			}
			
			return result;  
			
		};
		
		System.out.println("Lambda Reversed is: " + reverseString.func("Lambda"));
		System.out.println("The factorial of the number 5 is: " + factorial.func(5));
		
	}
	
}
