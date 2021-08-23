package com.JavaConcepts;
class DemoOne
{
	 int a =10;
	public void hello()
	{
		System.out.println("hello method");
	}
	public void display()
	{
		System.out.println("display method");
	}
  public void aValue() 
  {
	System.out.println("a value is :"+a);
  }
}
class DemoTwo extends DemoOne
{
	public void childMethod()
	{
		System.out.println("child method");
	}

}

public class InhertanceExam 
{  

	public static void main(String[] args) 
	{
		DemoTwo demotwo = new DemoTwo();
		System.out.println(demotwo.a);
        demotwo.hello();
        demotwo.display();
        demotwo.childMethod();
        DemoOne demoone= new DemoOne();
        demoone.aValue();
       
	}

}
