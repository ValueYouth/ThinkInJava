/**
 * ʱ�䣺2015��11��8��10:47:56
 * Ŀ�ģ���ʽ�������ģ��C�����е�printf��
 */

package com.valueyouth.strings;


public class SimpleFormat
{
	public static void main(String[] args)
	{
		int x = 5 ;
		double y = 3.1415 ;
		
		System.out.println("Row 1: [" + x + " " + y + "]"); // �ɵķ���
		System.out.format("Row 1: [%d %f]\n", x, y) ; // �µķ���
		System.out.printf("Row 1: [%d %f]\n", x, y); // �������ַ���
	}
}
