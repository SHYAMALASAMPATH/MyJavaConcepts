package com.collectionframeworks;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTreesetDemo 
{
public static void main(String[] args) 
{
		NavigableSet ns = new TreeSet();
		ns.add(1000);
		ns.add(2000);
		ns.add(3000);
		ns.add(4000);
		ns.add(5000);
		System.out.println("navigable set is :"+ns);
		System.out.println(ns.ceiling(3000));//3000
		System.out.println(ns.higher(3000));//4000
		System.out.println(ns.floor(3000));//3000
		System.out.println(ns.lower(3000));//2000
		System.out.println(ns.pollFirst());//1000
		System.out.println(ns.pollLast());//5000
		System.out.println(ns);//[2000,3000,4000]
		System.out.println(ns.descendingSet());//[4000,3000,2000]
	}

}
