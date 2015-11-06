package com.valueyouth.test;


public class ExceptionTest
{
	public static void fun()
	{
		System.out.println("fun...");
		throw new RuntimeException() ;
	}
	
	
	public static void main(String[] args)
	{
		
		try
		{
			@SuppressWarnings("unused")
			int a = 3 / 0 ;   // 运行时异常
			System.out.println("try...");
			fun();
			System.out.println("test...");
		}
		catch(Exception e)
		{
			System.out.println("catch...");
		}
/*		catch(RuntimeException a)
		{
//			System.out.println("123");
			a.printStackTrace();
		}
*/		
		finally
		{
			System.out.println("finally...");
		}
		
		System.out.println("default...");
	}
	
	
}
