package com.Cursursdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
{
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	for(int i =0;i<=10;i++)
	{
		al.add(i);
	}
System.out.println("arraylist al is :"+al);
Iterator i =al.iterator();
while (i.hasNext()) 
{
Integer i1 =	(Integer) i.next();
if(i1%2==0)
	System.out.print("even number in al is :"+i1);
else
	i.remove();
}
System.out.println("after removing odd numbers al is :"+al);
}

}
