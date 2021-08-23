 package com.JavaConcepts;

 class Parent
{
	 public void A()
	 {
		 System.out.println("PARENT A");
	 }
	public void B()
	{
		System.out.println("PARENT B");
	}
}
 class Child extends Parent
{
	 @Override
	 public void A()
	 {
		 System.out.println("CHILD A");
	 }
	public void B()
	{
		System.out.println("child B");
	}
}
public class OverrideingDemo
{

	public static void main(String[] args)
	{
		Child c = new Child();
		c.A();
		c.B();
		Parent p= new Parent();
		p.A();
		p.B();
		Parent pa= new Child();
		pa.A();
		pa.B();
	}

}
