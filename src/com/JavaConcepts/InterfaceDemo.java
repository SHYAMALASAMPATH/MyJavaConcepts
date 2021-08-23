package com.JavaConcepts;
interface  Atm
{
	void cashwithDraw();
	void miniStatement();
	void fastcash();
	void balanceEnquiry();
	void pinChange();
}
abstract class AtmImplements implements Atm
{
	public void cashwithDraw()
	{
		System.out.println("cash withdraw");
	}
	public void miniStatement()
	{
		System.out.println("ministatement");
	}
	public void fastcash()
	{
		System.out.println("fastcash");
	}
	public void pinChange()
	{
		System.out.println("pinchange");
	}
}
class TestInt extends AtmImplements
{

	@Override
	public void balanceEnquiry() 
	{
	System.out.println("balance enquiry");	
	}
}
public class InterfaceDemo
{
    public static void main(String[] args) 
	{
    	TestInt test = new TestInt();
    	test.balanceEnquiry();
    	test.cashwithDraw();
    	test.fastcash();
    	test.miniStatement();
    	test.pinChange();
    	Atm atm =new TestInt();
    	atm.balanceEnquiry();
    	atm.cashwithDraw();
    	atm.fastcash();
    	atm.miniStatement();
    	atm.pinChange();
		
	}

}
