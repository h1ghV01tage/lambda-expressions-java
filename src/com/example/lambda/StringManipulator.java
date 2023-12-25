package com.example.lambda;

interface Manipulatior{
	
	String reverse(String str);
	
}

public class StringManipulator {

	public static void main(String[] args) {
		
		//create a reference to the interface
		Manipulatior reverseString = (str) -> {
			
			StringBuilder strung = new StringBuilder(str);
			
			return strung.reverse().toString();
			
			
		};
		
		System.out.println(reverseString.reverse(null));
		
		
		
		
	}
	
	
}
