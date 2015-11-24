/**
 * ʱ�䣺2015��10��30��15:10:31
 * Ŀ�ģ��쳣�ᶪʧ���ڸò��Գ����У�VeryImportantException
 *       �쳣�������������finally�Ӿ��е�HohumException��
 *       ȡ����
 *       Ҳ����Java��δ���汾�л�����������⡣
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
