/**
 * 时间：2015年10月25日11:51:18
 * 目的：捕获异常后，有可能抛出另外一种异常。
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