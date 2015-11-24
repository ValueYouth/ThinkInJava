/**
 * 未异常类定义一个接受字符串参数的构造器
 */

package com.valueyouth.exceptions;


class MyException1 extends Exception
{
	/**
	 * 默认构造器
	 */
	public MyException1()
	{
		// 什么都不写
	}
	
	/**
	 * 带有一个字符串参数的构造器
	 * @param msg   字符串msg，最终调用Throwable类的构造器。
	 */
	public MyException1(String msg)
	{
		super(msg) ;
	}
}

public class FullConstructors 
{
	/**
	 * f()方法将抛出异常，该异常是无参的
	 * @throws Exception   抛出无参的异常
	 */
	public static void f() throws MyException1
	{
		System.out.println("Throwing MyException1 from f()");
		throw new MyException1() ;
	}
	
	/**
	 * g()方法将抛出异常，该异常是带一个字符串的参数
	 * @throws Exception
	 */
	public static void g() throws MyException1
	{
		System.out.println("Throwing MyException1 from g()");
		throw new MyException1("Originated in g()") ;
	}
	
	public static void main(String[] args)
	{
		try
		{
			f() ;
		}
		catch( MyException1 e )
		{
			e.printStackTrace();
		}
		
		try
		{
			g() ;
		}
		catch( MyException1 e )
		{
			e.printStackTrace(System.out); // 从方法调用处直到异常抛出处。被发送到屏幕
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
