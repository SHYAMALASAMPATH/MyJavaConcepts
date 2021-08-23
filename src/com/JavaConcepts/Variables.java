package com.JavaConcepts;

public class Variables 
{
	public String name ;
	private double salary;
	// variable assigned through constructor
	public Variables(String empName)
	{
	name=empName;
	}
	//variable assign through method
	public void setSalary(double empsal)
	{
	salary=empsal;
	}
	
void localVariable()
{
	int a;
	//local variable must be assign before use System.out.println(a);
	a=0;
	System.out.println(a);
	
}
public static void main(String[] args) 
{
	Variables var =new Variables("SAMPATH");
	var.setSalary(25000);
	System.out.println(var.name+"is getting salary is"+var.salary);
}

}
