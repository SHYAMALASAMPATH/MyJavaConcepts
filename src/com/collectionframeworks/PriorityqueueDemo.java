package com.collectionframeworks;

import java.util.PriorityQueue;

public class PriorityqueueDemo 
{
public static void main(String[] args) 
{
	PriorityQueue pq = new  PriorityQueue();
	System.out.println("default size of priority queue is :"+ pq.size() );
	pq.offer(0);//adding 0 to pq
	//System.out.println("head element pq is :"+pq.peek());//if empty it return null
	//System.err.println("head of element is :"+pq.element());//if pq empty retun nosuchelementexception
    System.out.println("removing head object in pq is "+pq.poll());//if pq empty return null
for(int i=0;i<=10;i++)
{
	pq.offer(i);
}
System.out.println("after adding through for pq is :"+pq);
pq.poll();//if pq empty retuns null
System.out.println("after remove ele with poll() pq is :"+pq);
 pq.remove();// if empty retuns nosuchelementexception
System.out.println("after remove ele with remove() pq is :"+pq);

}

}
