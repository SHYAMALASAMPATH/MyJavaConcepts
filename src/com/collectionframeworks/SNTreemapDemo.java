package com.collectionframeworks;

import java.util.TreeMap;

public class SNTreemapDemo
{
public static void main(String[] args)
{
	TreeMap tm = new TreeMap();
	tm.put(100,"zzz");
	tm.put(200,'s');
	tm.put(300,100);
	tm.put(400,true);
	//tm.put("aaa","bbb");//adding hetrogenous key can't add hetrogeneous keys DEFAULT SORTING ORDER
	//tm.put(null,"zzz");// adding null as key can't add null as key after 1.6 v treemap
System.out.println("treemap data is :"+tm);

}

}
