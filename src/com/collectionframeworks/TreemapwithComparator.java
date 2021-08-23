package com.collectionframeworks;

import java.util.Comparator;
import java.util.TreeMap;

class Mycomparator1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	String s1 = o1.toString();
	String s2 = o2.toString();
		return s2.compareTo(s1);//sort by decending order
	}
	
}
public class TreemapwithComparator 
{
  public static void main(String[] args)
  {
		TreeMap tm = new TreeMap(new Mycomparator1());
		tm.put("AAA", 101);
		tm.put("ZZZ", 102);
		tm.put("BBB", 103);
		tm.put('A', 104);
		tm.put(101, 105);
		tm.put("YYY", 106);
		
System.out.println("treemap  with customized decending order :"+tm);
   }}
