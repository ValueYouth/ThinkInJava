/**
 * δ�쳣�ඨ��һ�������ַ��������Ĺ�����
 */

package com.valueyouth.exceptions;


class MyException1 extends Exception
{
	/**
	 * Ĭ�Ϲ�����
	 */
	public MyException1()
	{
		// ʲô����д
	}
	
	/**
	 * ����һ���ַ��������Ĺ�����
	 * @param msg   �ַ���msg�����յ���Throwable��Ĺ�������
	 */
	public MyException1(String msg)
	{
		super(msg) ;
	}
}

public class FullConstructors 
{
	/**
	 * f()�������׳��쳣�����쳣���޲ε�
	 * @throws Exception   �׳��޲ε��쳣
	 */
	public static void f() throws MyException1
	{
		System.out.println("Throwing MyException1 from f()");
		throw new MyException1() ;
	}
	
	/**
	 * g()�������׳��쳣�����쳣�Ǵ�һ���ַ����Ĳ���
	 * @throws Exception
	 */
	public static void g() throws MyException1
	{
		System.out.println("Throwing MyException1 from g()");
		throw new MyException1("Originated in g()") ;
	}
	
	public static void main(String[] args)
	{
		try
		{
			f() ;
		}
		catch( MyException1 e )
		{
			e.printStackTrace();
		}
		
		try
		{
			g() ;
		}
		catch( MyException1 e )
		{
			e.printStackTrace(System.out); // �ӷ������ô�ֱ���쳣�׳����������͵���Ļ
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
