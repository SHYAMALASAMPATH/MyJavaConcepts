package com.collectionframeworks;

import java.util.Comparator;
import java.util.PriorityQueue;
class Ownqueuecomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);//decending order of strings
	}

	
}
public class CustPriorityqueueDemo 
{
public static void main(String[] args) 
{
PriorityQueue pq = new PriorityQueue(15, new Ownqueuecomparator());
pq.offer("a");
pq.offer("z");
pq.offer("b");
pq.offer("y");
pq.offer("c");
pq.offer("x");
System.out.println("queue is with customized sorting order"+pq);
}
}
