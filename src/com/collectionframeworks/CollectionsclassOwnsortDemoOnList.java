package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Collectonsowncomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Integer i1 =   (Integer) o1;
		Integer i2  =  (Integer) o2;
		return i2.compareTo(i1);
	}
	
}

public class CollectionsclassOwnsortDemoOnList 
{

public static void main(String[] args) 
{
	ArrayList al = new ArrayList();
	al.add(15);
	al.add(0);
	al.add(20);
	al.add(10);
	al.add(5);
	//al.add(new string("sampath"));//if dnso ojects should be homogeneous//cce
	//al.add(null);//npe ce
	System.out.println("before sorting arraylist is :"+al);
	Collections.sort(al, new Collectonsowncomparator());
	System.out.println("customized sorting arraylist with collections class comparator is :"+al);
int index =Collections.binarySearch(al, 10,new Collectonsowncomparator());//2
System.out.println("index of 10 is :"+index);
int index1 =Collections.binarySearch(al, 12,new Collectonsowncomparator());//-3
System.out.println("index of 12 is where we can place in al is :"+index1);
int index2 =Collections.binarySearch(al, 15);//unpreditive values if not pass comparator
System.out.println(index2);
}
}
