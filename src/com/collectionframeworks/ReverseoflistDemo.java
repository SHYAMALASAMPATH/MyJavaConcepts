package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseoflistDemo 
{
   public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println("Aarraylist al is :"+al);
        Collections.reverse(al);
        System.out.println("after reverse al is :"+al);

	}

}
