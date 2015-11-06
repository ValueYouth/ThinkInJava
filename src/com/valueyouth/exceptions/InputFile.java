/**
 * ʱ�䣺2015��11��3��14:53:10
 * Ŀ�ģ��쳣����ʱ�����ڹ�������˵������Ҳ���޷�����������
 *       finally��ÿ��ִ��������롣�������������ִ�й���
 *       �а�;���ϣ�Ҳ��ö����ĳЩ���ֻ�û�б��ɹ�������
 *       ����Щ������finally�Ӿ���ȷʵҪ������ġ�
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
			System.out.println("�޷���" + fname);
			
			// �޷��򿪣��������رա�
			throw e ; 
		}
		catch ( Exception e )
		{
			// ���������쳣����Ҫ�ر��ļ�
			try
			{
				in.close();
			}
			catch ( IOException e2 )
			{
				System.out.println("in.close() unsuccessful");
			}
			
			throw e ; // �����׳�
		}
		finally
		{
			// �������Ҫ�ر��ļ�
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
