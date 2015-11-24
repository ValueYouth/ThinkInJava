/**
 * ʱ�䣺2015��10��25��11:51:18
 * Ŀ�ģ������쳣���п����׳�����һ���쳣��
 */

package com.valueyouth.exceptions;


@SuppressWarnings("serial")
class OneException extends Exception
{
	public OneException(String s)
	{
		super(s) ;
	}
}

@SuppressWarnings("serial")
class TwoException extends Exception
{
	public TwoException(String s)
	{
		super(s) ;
	}
}

public class RethrowNew
{
	public static void f() throws OneException
	{
		System.out.println("originating the exception in f()");
		throw new OneException("throw from f()...") ;
	}
	
	public static void main(String[] args)
	{
		try
		{
			try
			{
				f() ;
			}
			catch ( OneException e )
			{
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				
				throw new TwoException("from inner try...") ;
			}
		}
		catch ( TwoException e )
		{
			System.out.println("Caught in outer try,e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
	
}