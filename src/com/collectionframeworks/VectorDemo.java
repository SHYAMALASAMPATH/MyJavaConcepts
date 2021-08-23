package com.collectionframeworks;

import java.util.Vector;

public class VectorDemo 
{
 public static void main(String[] args) 
 {
	 Vector v = new Vector();//vector(25),vector(10,5),vector(new arraylist)
	 System.out.println(v.capacity());
	 for (int i = 1; i<=10; i++) 
	 {
		 v.addElement(i);
	 }
	 System.out.println(v.capacity());
	 v.addElement("sampath");;
	 System.out.println("vector data is :"+ v);
	 System.out.println("vector capacity after adding 11th data  :"+v.capacity());
	}

}
