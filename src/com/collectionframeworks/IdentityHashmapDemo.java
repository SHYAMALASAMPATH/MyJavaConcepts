package com.collectionframeworks;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapDemo
{
public static void main(String[] args) 
{
	HashMap hm = new HashMap();
	Integer i1 = new Integer(10);
	Integer i2 = new Integer(10);
	hm.put(i1, "shyamala");
	hm.put(i2, "sampath");// here internally i1.equals(i2) method invoked to check duplicates
System.out.println("hashmap data is :"+hm);
IdentityHashMap ihm = new IdentityHashMap();
ihm.put(i1, "shyamala");
ihm.put(i2, "sampath");//here internally (==) operation done to check dupicate keys
System.out.println("identityhashmap data is : "+ihm);
}

}
