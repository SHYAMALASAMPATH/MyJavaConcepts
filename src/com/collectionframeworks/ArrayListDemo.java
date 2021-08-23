
package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListDemo 
{
  public static void main(String[] args) 
	{
   ArrayList al= new ArrayList();
	System.out.println("difault size of arraylist is :"+al.size());
	al.add("samapth");
	al.add(10);
	al.add("shyamala");
	al.add(null);
	al.add(10);
	al.add(null);
	System.out.println(al);
	// removing value through index
	System.out.println("before removeing size is :"+al.size());
	System.out.println(al.remove(2));
	System.out.println(al);
	System.out.println("remove the value through index after arraylist size :"+al.size());
	//add value through index
	al.add(2, "shyamala");
	System.out.println(al);
	//removing value through  object value
	System.out.println(al.remove("samapth"));
	System.out.println(al);
	System.out.println("arraylist size is  :"+al.size());
	  boolean b=al.contains(10);
	  System.out.println(b);
	 System.out.println(al.lastIndexOf(10));
	}

}
