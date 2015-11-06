/**
 * ʱ�䣺2015��11��3��15:12:44
 * Ŀ�ģ����ڹ���׶ο����׳��쳣������Ҫ��������࣬
 *       �ȫ��ʹ�÷�ʽ��ʹ��Ƕ�׵�try�Ӿ䡣
 */

package com.valueyouth.exceptions;


public class Cleanup
{
	public static void main(String[] args)
	{
		try
		{
			InputFile in = new InputFile("Cleanup.java") ;
			
			try
			{
				String s ;
				int i = 1 ;
				
				while ( (s = in.getLine()) != null )
				{
					; // ...
				}
			}
			catch ( Exception e )
			{
				System.out.println("Caught Exception in main()");
				e.printStackTrace(System.out);
			}
			finally
			{
				in.dispose();
			}
		}
		catch ( Exception e )
		{
			System.out.println("InputFile construction failed");
		}
	}
}
