package com.collectionframeworks;

import java.util.LinkedHashSet;

public class LInkedHashsetDemo 
{
    public static void main(String[] args) 
	{
LinkedHashSet lh = new LinkedHashSet();
lh.add("B");
lh.add("C");
lh.add("D");
lh.add("Z");
lh.add(null);
lh.add(10);//insertion order is preserved 
System.out.println(lh.add(10));
System.out.println(lh);
	}

}
