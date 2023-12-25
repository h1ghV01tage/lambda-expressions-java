package com.example.lambda;

interface NumericTest{
	
	boolean test(int n);
	
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		//A lambda expression that tests if a number is even
		NumericTest isEven = (n)-> (n % 2) == 0;
		
		//check if the given number is even
		if(isEven.test(10)) System.out.println("Even");
		
		//Lambda expression that tests if a number is non-negative
		NumericTest isPositive = (n) -> n >= 0;
		
		//check if the number is positive
		if(isPositive.test(-10)) System.out.println("Positive");
		
		
		
	}
	
}
