package com.junit;

public class Factorial {
	public int factorialMethod(int n) 
	{
		if(n<2) return 1;
		return n*factorialMethod(n-1);
	}
}
