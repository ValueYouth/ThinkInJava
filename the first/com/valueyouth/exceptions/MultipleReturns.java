/**
 * ʱ�䣺2015��10��30��14:56:23
 * Ŀ�ģ�finally�Ӿ��ܻ�ִ�У���ˣ���һ�������У�
 *       ���ԴӶ���㷵�ء�
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
