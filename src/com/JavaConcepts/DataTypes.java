package com.JavaConcepts;

public class DataTypes 
{
   public static void main(String[] args)
	{
		int a=11;
		Integer a1 = 10;
		System.out.println(a1.compareTo(a));//if a1<a  returns  -1,a1>a=1,a1=a=0
        System.out.println(a1.SIZE); 
		String s="sampath";
		System.out.println("charat method "+s.charAt(0));
		System.out.println("codepoint at method "+s.codePointAt(4));
		System.out.println("codeoint before "+s.codePointBefore(4));
		System.out.println("codepoint count "+s.codePointCount(0, 6));
		System.out.println("length method "+s.length());
	}

}
