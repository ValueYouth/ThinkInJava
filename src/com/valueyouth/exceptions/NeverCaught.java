/**
 * ʱ�䣺2015��10��30��08:47:39
 * Ŀ�ģ�������RuntimeException�쳣���ᷢ��ʲô���أ�
 * ������������Ը��쳣˵��������ǿ�Ƽ�飬RuntimeException����
 *       ���쳣�ᴩԽ���е�ִ��·��ֱ��main()���������ᱻ����
 *       �ڳ����˳�ǰ���������쳣��printStackTrace()������
 */

package com.valueyouth.exceptions;


public class NeverCaught
{
	static void f()	
	{
		throw new RuntimeException("from f()") ;
	}
	
	static void g()
	{
		f() ;
	}
	
	public static void main(String[] args)
	{
		g() ;
	}
}
