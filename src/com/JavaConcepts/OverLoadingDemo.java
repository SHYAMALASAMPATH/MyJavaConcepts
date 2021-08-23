package com.JavaConcepts;
class Demo
{
	int a,b;
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(float a, float b)
	{
		float c=a+b;
		System.out.println(c);
	}
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add()
	{
		
		System.out.println("add method with no arguments");
	}
}
public class OverLoadingDemo 
{
     public static void main(String[] args)
     {
	Demo demo =new Demo();
	demo.add();
	demo.add(10, 20);
	demo.add(10.5f, 12.5d);
	demo.add(10.4d, 10.5d);

	 }

}
