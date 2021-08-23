package com.collectionframeworks;

import java.util.LinkedList;

public class LinkedListdemo 
{
public static void main(String[] args) 
{
	LinkedList ll = new LinkedList();
	ll.add("durga");
	ll.add(30);
	ll.add(null);
	ll.add("durga");
	ll.addFirst(null);
	ll.set(0, "software");// replace the value in 0 index place
	ll.add(0, "sampath");
	ll.addFirst("shyamala");
	ll.add(30);
	System.out.println(ll);
}

}
