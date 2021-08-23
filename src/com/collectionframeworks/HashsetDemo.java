package com.collectionframeworks;

import java.util.HashSet;

public class HashsetDemo 
{
public static void main(String[] args) 
{
		HashSet h = new HashSet();
		System.out.println("hashset size is :"+h.size());
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add(10));
		System.out.println("hashset size is :"+h.size());
		System.out.println(h);
 }

}
