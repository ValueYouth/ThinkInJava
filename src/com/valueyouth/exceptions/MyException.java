/**
 * 2015��10��24��10:19:17
 * �����Զ����쳣����������е��쳣��̳С�
 */

package com.valueyouth.exceptions;


@SuppressWarnings("serial")
public class MyException extends Exception
{
	public void f() throws MyException
	{
		System.out.println("Throw MyException from f()");
		throw new MyException() ;
	}
	
	public static void main(String[] args)
	{
		MyException me = new MyException() ;
		
		try
		{
			me.f() ;
		}
		catch ( MyException e )
		{
			System.out.println("Catch it!");
		}
	}
}
