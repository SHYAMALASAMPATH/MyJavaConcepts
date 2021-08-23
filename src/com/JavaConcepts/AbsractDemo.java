package com.JavaConcepts;

public class AbsractDemo
{
	public static void main(String[] args) 
	{
	 Iphone obj =new Iphone();
       show(obj);
       Samsung obj1= new Samsung();
      show(obj1);
	}
	public static void show(Iphone obj)
	{
		System.out.println("Hello");
		obj.showConfig();
	}
	public static void show(Samsung obj)
	{
		obj.showConfig();
	}
}
abstract class Phone
{
	abstract public void showConfig();
}
class Iphone extends Phone
{
	public void showConfig() 
	{
		System.out.println("2gb , ios 9.3");
	}
}
class Samsung extends Phone
{
	public void showConfig() 
	{
		System.out.println("2gb , Lolipop");
		
	}
}