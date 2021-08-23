package com.collectionframeworks;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator2 implements Comparator
{
	@Override
	public int compare(Object obj1, Object obj2) 
	{
	String s1 = (String) obj1;
	String s2 = obj2.toString();
	return -s1.compareTo(s2);
	}
}

public class TreesetownsortingwithStrings 
{
public static void main(String[] args) 
{
	TreeSet t = new TreeSet(new MyComparator2());
	t.add("jeevika");
	t.add("laxmi narmadha");
	t.add("sampath");
	t.add("rajesh");
	t.add("subhadra");
	t.add("venkateswarlu");
	//t.add(10);
	System.out.println("printing decending order of alphbets");
System.out.println(t);

}

}
