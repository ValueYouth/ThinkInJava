/**
 * ʱ�䣺2015��11��6��11:17:36
 * Ŀ�ģ�1. public final class String
 *       2. String�����ǲ��ɱ�ģ�Ҳ���ǡ�ֻ������
 */

package com.valueyouth.strings;


public class Immutable
{
	public static String upcase(String s)
	{
		return s.toUpperCase() ;
	}
	
	public static void main(String[] args)
	{
		String q = "howdy" ;
		System.out.println(q);  // howdy
		
		String qq = upcase(q) ;
		System.out.println(qq); // HOWDY
		System.out.println(q);  // howdy
	}
}
