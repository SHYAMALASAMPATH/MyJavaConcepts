package com.collectionframeworks;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableTreemapDemo 
{
 public static void main(String[] args)
 {
 NavigableMap<String, String> nm = new TreeMap<String, String>();
 nm.put("b","banana");
 nm.put("c", "cat");
 nm.put("a", "apple");
 nm.put("d","dog");
 nm.put("g", "gun");
 System.out.println("navigable map data is :"+nm);
 System.out.println("cileing key of nm(c) is :"+nm.ceilingKey("c"));//c
 System.out.println("higher key of nm(e) is :"+nm.higherKey("e"));//g
 System.out.println("floar key of nm(e) is :"+nm.floorKey("e"));//d
 System.out.println("lower  key of nm(d) is :"+nm.lowerKey("d"));//c
 System.out.println("removing first ele of nm is :"+nm.pollFirstEntry());//a=apple
 System.out.println("removing last ele of nm is :"+nm.pollLastEntry());//g=gun
 System.out.println("after first and last entry of nm ddecending order is : "+nm.descendingMap());
 System.out.println("after first and last entry of nm is :"+nm);
 }

}
