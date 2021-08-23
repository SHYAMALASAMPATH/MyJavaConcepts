package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class BinarysearchwithList
{
 public static void main(String[] args)
 {
	 ArrayList al = new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("K");
		al.add("N");
		al.add("a");
		System.out.println("before sorting al is :"+al);
		//default natural sorting al  with collectins class
		Collections.sort(al);
		System.out.println("after dns al is :"+ al);
	System.out.println(Collections.binarySearch(al,"Z"));
	System.out.println(Collections.binarySearch(al,"C"));
	}

}
