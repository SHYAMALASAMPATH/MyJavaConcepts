package com.collectionframeworks;

import java.util.Hashtable;

class Temp1
{
	int i;
	public Temp1(int i) 
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i ;//if i%9
	}
	public String toString() 
	{
		return i+"" ;
	}
}
public class HashTableDemo 
{
public static void main(String[] args) 
{
	Hashtable ht = new Hashtable();
	System.out.println("hashtable size is  :"+ht.size());
	ht.put(new Temp1(5), "A");
	ht.put(new Temp1(2), "B");
	ht.put(new Temp1(6), "C");
	ht.put(new Temp1(15), "D");//15%11=4
	ht.put(new Temp1(23), "E");//23%11=1
	ht.put(new Temp1(16), "F");//16%11=5
	//ht.put("DURGA", null);// we can't insert null value to hashtable
	//giving our own hashcode 
	System.out.println("hashtable data is  :"+ht);
	System.out.println("hashtable size is :"+ht.size());
	
	// we will get data from top to bottom [10-0]nd right to left
}

}
