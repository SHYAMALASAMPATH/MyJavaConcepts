package com.collectionframeworks;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
class Mycomparetor implements Comparator
{
	// own sorting compare method print decending order values
	@Override
	public int compare(Object obj1, Object obj2)
	{
		Integer i1 =   (Integer) obj1;
		Integer i2 =  (Integer) obj2;
		//return i1.compareTO(i2);accending
		return - i1.compareTo(i2);//decending
		//return  i2.compareto(i1);//decending
		//return - i2.compareto(i1);//accending
		//retuen +1 //insertion oredr will get
		// return -1 // reverse of insertion order get
		// return 0 // will get only first insert value all are consider as duplicate
//		if(i1<i2)
//		{
//			return +1;
//		}
//		else if(i1>i2)
//		{
//			return -1;
//		}
//		else
//	        return 0;
	}
	
}

public class TreesetComparaterDemo 
{
public static void main(String[] args) 
   {
	TreeSet t = new TreeSet();
	t.add(0);
	t.add(9);
	t.add(4);
	t.add(7);
	t.add(5);
	t.add(3);
	t.add(6);
	t.add(2);
	t.add(8);
	t.add(1);
	t.add(0);
	//t.add('A');cce
	// default sorting order will come compareTo() method in comparable interface
	System.out.println("printing default sorting order :");
	System.out.println(t);
// values printing our own sorting order through compare() method comaparetor interface
TreeSet t2 = new TreeSet(new Mycomparetor());
t2.add(0);
t2.add(9);
t2.add(4);
t2.add(7);
t2.add(5);
t2.add(3);
t2.add(6);
t2.add(2);
t2.add(8);
t2.add(1);
//t2.add("sampath");
//  t2.add('A');
//t2.add(true);
System.out.println("printing cutomized sorting order : through own  compare method");
System.out.println(t2);
	}

}
