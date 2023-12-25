package com.example.lambda;

interface StringFunc{
	
	String Func(String n);
	
}

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		
		//The block lambda expression that reverses a string
		StringFunc reverse = (str) -> {
			
			String result = "";
			
			for(int i = str.length() - 1; i >= 0; i--) {
				
				result += str.charAt(i);
				
			}
			
			return result;
			
		};
		
		System.out.println("Lambda Reversed is: " + reverse.Func("Lambda"));
		System.out.println("Expression reversed is: " + reverse.Func("Expression"));
		
		
		
	}
	
	
}
