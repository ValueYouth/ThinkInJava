/**
 * ʱ�䣺2015��10��25��10:23:21
 * Ŀ�ģ���֤ջ�켣�ĵ��÷����͵���˳��
 *       1. printStackTrace()�����ṩ����Ϣ��ͨ��getStackTrace()����
 *          ��ֱ�ӷ��ʡ�
 *       2. getStackTrace()��������һ����ջ�켣�е�Ԫ�ع��ɵ����飬��
 *          ��ÿ��Ԫ�ض�����ջ�е�һ֡��
 *       3. Ԫ��0(�±�)��ջ��Ԫ�أ�ջ��Ԫ���ǵ��������е����һ������
 *          ���ã����Throwable���������׳�֮��)��
 */

package com.valueyouth.exceptions;


public class WhoCalled
{
	static void f()
	{
		// ����һ���쳣��������켣ջ
		try
		{
			throw new Exception() ;
		}
		catch ( Exception e )
		{
			for ( StackTraceElement ste : e.getStackTrace() )
			{
				System.out.println(ste.getMethodName());
			}
		}
	}
	
	static void g()
	{
		f() ;
	}
	
	static void h()
	{
		g()	;
	}
	
	public static void main(String[] args)
	{
		f() ;
		System.out.println("-----------------------------");
		g() ;
		System.out.println("-----------------------------");
		h() ;
	}
}
