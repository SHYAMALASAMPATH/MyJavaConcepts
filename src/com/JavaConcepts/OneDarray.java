package com.JavaConcepts;

import java.util.Arrays;

public class OneDarray 
{
	public static void main(String[] args)
	{
	 int a[]=new int[5];
	 a[0]=4;
	 a[1]=2;
	 a[2]=3;
	 a[3]=1;
	 a[4]=5;
	 System.out.println("starting array is ");
	 System.out.println("starting length of array is :"+ a.length);
	 for(int b:a)
	 {
	 System.out.println(b);
	 }
	 Arrays.parallelSort(a);
	 System.out.println("after parallel sort array is");
	 for(int b:a)
	 {
	 System.out.println(b);
	 }
	 System.out.println("binary search operation on 4 data it will returm index place");
	 System.out.println(Arrays.binarySearch(a, 4));
	}

}
