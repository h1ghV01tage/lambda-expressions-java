package com.example.lambda;

//Demonstrate a simple lambda expression

//functional interface
interface MyNumber {
	
	double getValue();
	
}


public class LambdaDemo {
	
	//A main method
	public static void main(String[] args) {
		
		//declare a reference to the interface
		MyNumber myNum;
		
		//Constant expression: lambda expression
		//when it is assigned to myNum, a class instance is constructed in which the lambda expression
		//implements the getValue method
		
		myNum = ()-> 123.45;
		
		System.out.println("A fixed value: " + myNum.getValue());
		
		//A more complex expression
		myNum = ()-> Math.random() * 100;
		
		//print to the console
		System.out.println("A random value: " + myNum.getValue());
		
	
		
	}
	
	
}
