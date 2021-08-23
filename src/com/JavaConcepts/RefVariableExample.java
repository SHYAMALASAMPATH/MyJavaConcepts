package com.JavaConcepts;

public class RefVariableExample 
{
int x=10;
static int y=20;
	public static void main(String[] args) 
	{
		RefVariableExample rve;
		//System.out.println(rve.x);//rve is not initialized
		//System.out.println(rve.y);//y is static field so should be accssed in static away
		
		System.out.println(RefVariableExample.y);
          rve= new RefVariableExample();
          System.out.println(rve.x);

	}

}
