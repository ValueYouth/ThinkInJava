/**
 * 时间：2015年11月3日14:53:10
 * 目的：异常发生时，对于构造器来说，清理也许无法正常工作。
 *       finally会每次执行清理代码。如果构造器在其执行过程
 *       中半途而废，也许该对象的某些部分还没有被成功创建。
 *       而这些部分在finally子句中确实要被清理的。
 */
package com.valueyouth.exceptions;

import java.io.*;


public class InputFile
{
	private BufferedReader in ;
	
	public InputFile(String fname) throws Exception
	{
		try
		{
			in = new BufferedReader(new FileReader(fname)) ;
		}
		catch ( FileNotFoundException e )
		{
			System.out.println("无法打开" + fname);
			
			// 无法打开，因此无需关闭。
			throw e ; 
		}
		catch ( Exception e )
		{
			// 所有其他异常都需要关闭文件
			try
			{
				in.close();
			}
			catch ( IOException e2 )
			{
				System.out.println("in.close() unsuccessful");
			}
			
			throw e ; // 重新抛出
		}
		finally
		{
			// 在这里，不要关闭文件
		}
	}
	
	public String getLine()
	{
		String s ;
		
		try
		{
			s = in.readLine() ;
		}
		catch ( IOException e )
		{
			throw new RuntimeException("readLine() failed") ;
		}
		
		return s ;
	}
	
	public void dispose()
	{
		try
		{
			in.close();
			System.out.println("dispose() successful");
		}
		catch ( IOException e )
		{
			throw new RuntimeException("readLine() failed") ;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
