package com.collectionframeworks;

import java.util.TreeSet;

public class TreesetDemo
{
public static void main(String[] args) 
{

TreeSet t = new TreeSet();
t.add("A");
t.add("a");
t.add("B");
t.add("C");
t.add("Z");
t.add("L");
//t.add(10);//classcastexception
//t.add(null);//nullpointerexception
System.out.println(t);
}

}
