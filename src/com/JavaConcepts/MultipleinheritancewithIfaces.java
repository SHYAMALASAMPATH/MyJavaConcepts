package com.JavaConcepts;
interface I1
{
	void m1();
}
interface I2
{
	void m1();
}
interface I3 extends I1,I2
{
	
}
public class MultipleinheritancewithIfaces implements I3
{
 public static void main(String[] args) 
 {
	I1 i3 = new MultipleinheritancewithIfaces();
	i3.m1();
 }

@Override
public void m1() 
{
	System.out.println("childclass m1 impleted method");
}
 }
