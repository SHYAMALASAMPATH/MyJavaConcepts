package com.Cursursdemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{
public static void main(String[] args) 
{
Vector v = new Vector();
for(int i =0;i<=10;i++)
{
	v.add(i);
}
System.out.println("vector  v is :"+v);
Enumeration e = v.elements();
System.out.println("enmuration data is :"+e);
while(e.hasMoreElements())
{
	int data =(int) e.nextElement();
			if(data%2==0)
			{
			System.out.print(data+ " ");
			}
		
}
System.out.println(v);
}

}
