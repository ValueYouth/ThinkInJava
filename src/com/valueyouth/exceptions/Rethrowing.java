package com.valueyouth.exceptions;


public class Rethrowing
{
	public static void f() throws Exception
	{
		// 此处的originate是创建的意思。
		System.out.println("originating the exception in f()");
		throw new Exception("throw from f()...") ;
	}
	
	public static void g() throws Exception
	{
		try
		{
			f() ;
		}
		catch( Exception e )
		{
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e ; // 将异常对象重新抛出,在main方法中的g()中处理
		}
	}
	
	public static void h() throws Exception
	{
		try
		{
			f() ;
		}
		catch( Exception e )
		{
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
			
			throw (Exception)e.fillInStackTrace() ;  //另一种重新抛出的方式
		}
	}
	
	public static void main(String[] args)
	{
		try 
		{
			g() ;
		}
		catch ( Exception e )
		{
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		
		try
		{
			h() ;
		}
		catch ( Exception e )
		{
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
