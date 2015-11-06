/**
 * ʱ�䣺2015��11��6��11:24:25
 * Ŀ�ģ���Ϊһ�����дtoString()����ʱ��
 *       1. ���ַ�����������������������
 *       2. ������ʹ��ѭ��������Լ�����һ��StringBuileder����
 */

package com.valueyouth.strings;

import java.util.Random;


public class UsingStringBuilder
{
	public static Random rand = new Random(35) ;
	
	public String toString()
	{
		StringBuilder result = new StringBuilder("[") ;
		
		for ( int i = 0; i < 25; i++ )
		{
			result.append(rand.nextInt(100)) ;
			result.append(",") ;
		}
		
		result.delete(result.length() - 2, result.length()) ;
		result.append("]") ;
		
		return result.toString() ;
	}
	
	public static void main(String[] args)
	{
		UsingStringBuilder usb = new UsingStringBuilder() ;
		System.out.println(usb);
	}
}
