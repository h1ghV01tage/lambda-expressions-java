package com.example.lambda;

//create an interface to declare a method
interface StringFunction {
	
	String func(String str);
	
}

//this application demonstrates providing lambda as argument
public class LambdaAsArgumentDemo {

	//create a method that takes the function and the string as an argument
	//and returns the result of processing the argument inside of the function
	
	static String StringOp(StringFunction sf, String s) {
		
		return sf.func(s);
		
	}
	
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to java";
		String outStr;
	
		System.out.println("Here is the input string " + inStr);
		
		//A simple lambda expression that uppercases a string
		outStr = StringOp((str) -> str.toUpperCase(), inStr);
		//print to the console the output
		System.out.println("The string in uppercase: " + outStr);
		//This passes a block lambda that removes spaces
		outStr = StringOp((str) -> {
			String result = "";
			int i;
			
			for(i = 0; i < str.length(); i++) {
				
				if(str.charAt(i)!= ' ') {
					result+=str.charAt(i);
				}
				
			}
			return result;
			
		} , inStr);
		
		//print the result to the console after removing spaces
		System.out.println("After removing spaces: " + outStr);
		
		//let's do another function
		//this one reverses the string
		StringFunction reverse = (str) -> {
			
			//an empty string to hold the result
			String result = "";
			
			for(int i = str.length()-1; i >= 0; i--) {
				
				result+=str.charAt(i);
				
			}
			
			return result;
			
		};
		
		//now let's pass the reverse as the first parameter to the stringOp method
		//and return the output of the result obtained from enumerating the function
		
		System.out.println("The reverse of the string is: " + StringOp(reverse, inStr));
			
	}
	
}
