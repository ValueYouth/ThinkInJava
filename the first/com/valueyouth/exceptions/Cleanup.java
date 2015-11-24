/**
 * 时间：2015年11月3日15:12:44
 * 目的：对于构造阶段可能抛出异常，并且要求清理的类，
 *       最安全的使用方式是使用嵌套的try子句。
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
