package com.collectionframeworks;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp
{
	public String toString()
	{
		return "temp" ;
	}
	public void finalize() 
	{
		System.out.println("temp finalize method");
	}
}
public class WeakHashmapDemo 
{
public static void main(String[] args) throws InterruptedException
{
HashMap hm = new HashMap();
Temp t = new Temp();
hm.put(t, "sampath");
System.out.println("hashmap data is :"+hm);
t=null;//doing temp value to null
System.gc();
Thread.sleep(5000);
System.out.println("hashmap data after going to garbagecollector :"+hm);
// above implemention with weakhashmap
WeakHashMap whm = new WeakHashMap();
Temp t1 = new Temp();
whm.put(t1, "sampath");
System.out.println("weakhashmap data is :"+whm);
t1=null;//doing temp value to null
System.gc();
Thread.sleep(5000);
System.out.println("weakhashmap data after going to garbagecollector :"+whm);

}

}
