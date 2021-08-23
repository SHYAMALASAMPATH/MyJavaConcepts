package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsclasssortDemo 
{
public static void main(String[] args) 
{
ArrayList al = new ArrayList();
al.add("Z");
al.add("A");
al.add("K");
al.add("N");
//al.add(new Integer(10));//if dnso ojects should be homogeneous//cce
//al.add(null);//npe ce
System.out.println("before sorting arraylist is :"+al);
Collections.sort(al);
System.out.println("afetr sorting arraylist with collections class is :"+al);

}

}
