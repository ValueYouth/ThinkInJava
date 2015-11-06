/**
 * ʱ�䣺2015��10��25��10:07:20
 * Ŀ�ģ�ʹ��Exception���͵�һЩ������������
 *       getMessage() ; // ��ȡ����쳣����ϸ��Ϣ
 *       getLoacalizedMessage(); // ���ظ��쳣���ػ�������
 *       toString(); // ���ض�Throwable�ļ�����
 *       printStackTrace(); // ��ӡThrowable��Throwable�ĵ��ù켣ջ
 *       printStackTrace(PrintStream); // ѡ���������1
 *       printStackTrace(java.io.PrintWriter); // ѡ���������2
 */

package com.valueyouth.exceptions;


public class ExceptionMethods
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exception("My Exception") ;
		}
		catch ( Exception e )
		{
			System.out.println("Caught the Exception");
			System.out.println("getMessage():" + e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println("toString():" + e);
			e.printStackTrace();
			e.printStackTrace(System.out) ;
		}
	}
}
