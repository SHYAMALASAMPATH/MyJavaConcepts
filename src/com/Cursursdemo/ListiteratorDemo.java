package com.Cursursdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListiteratorDemo 
{
public static void main(String[] args)
{
	LinkedList ll = new LinkedList();
	ll.add("balakrishna");
	ll.add("venky");
	ll.add("chiru");
	ll.add("nag");
	System.out.println("linked list data is :"+ll);
	ListIterator li= ll.listIterator();
	while (li.hasNext())
{
	String s1 =	(String) li.next();
	if(s1.equals("venky"))
		li.remove();
	else if(s1.equals("chiru"))
		li.set("ramcharan");
	else if(s1.equals("nag"))
		li.add("akhil");
}
	System.out.println(ll);
}

}
