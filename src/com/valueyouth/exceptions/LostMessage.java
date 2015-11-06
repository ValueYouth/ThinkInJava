/**
 * 时间：2015年10月30日15:10:31
 * 目的：异常会丢失。在该测试程序中，VeryImportantException
 *       异常不会输出，它被finally子句中的HohumException所
 *       取代。
 *       也许在Java的未来版本中会修正这个问题。
 */

package com.valueyouth.exceptions;


@SuppressWarnings("serial")
class VeryImportantException extends Exception
{
	public String toString()
	{
		return "A very important exception !" ;
	}
}

@SuppressWarnings("serial")
class HohumException extends Exception
{
	public String toString()
	{
		return "A trivial exception !" ;
	}
}


public class LostMessage
{
	void f() throws VeryImportantException
	{
		throw new VeryImportantException() ;
	}
	
	void dispose() throws HohumException
	{
		throw new HohumException() ;
	}
	
	public static void main(String[] args)
	{
		try
		{
			LostMessage lm = new LostMessage() ;
			
			try
			{
				lm.f();
			}
			finally
			{
				lm.dispose();
			}
		}
		catch ( Exception e )
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
