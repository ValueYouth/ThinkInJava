/**
 * 2015年10月24日10:19:17
 * 创建自定义异常，必须从已有的异常类继承。
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
