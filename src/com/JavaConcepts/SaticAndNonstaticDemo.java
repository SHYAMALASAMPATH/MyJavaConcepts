package com.JavaConcepts;

public class SaticAndNonstaticDemo 
{
int a=20;
static int b=10;
	public static void main(String[] args)
	{
		//System.out.println("a value is :"+a);getting error a is non static
		System.out.println("b value is :"+b);
		SaticAndNonstaticDemo sans= new SaticAndNonstaticDemo();
		System.out.println("a value is :"+sans.a);
		System.out.println("a+b value is :"+(sans.a+b));
	}

}
