package com.collectionframeworks;

import java.util.Stack;

public class StackDemo
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println("stack data is :"+s);
		System.out.println("d present index is :"+ s.search("d"));
		System.out.println("a present index is :"+ s.search("a"));
	
	}

}
