/**
 * 时间：2015年10月30日14:56:23
 * 目的：finally子句总会执行！因此，在一个方法中，
 *       可以从多个点返回。
 */

package com.valueyouth.exceptions;

public class MultipleReturns
{
	public static void f(int i)
	{
		System.out.println("Initialization that requires cleanup");
		
		try
		{
			System.out.println("Point 1");
			if ( i == 1 )
			{
				return ;
			}
			
			System.out.println("Point 2");
			if ( i == 2 )
			{
				return ;
			}
			
			System.out.println("Point 3");
			if ( i == 3 )
			{
				return ;
			}
			
			System.out.println("End");
			return ;	
		}
		finally
		{
			System.out.println("Performing cleanup");
		}
	}
	
	public static void main(String[] args)
	{
		for ( int i = 1; i <= 4; i++ )
		{
			f(i) ;
		}
	}
}
