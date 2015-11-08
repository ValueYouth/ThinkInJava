/**
 * 时间：2015年11月8日10:47:56
 * 目的：格式化输出。模仿C语言中的printf。
 */

package com.valueyouth.strings;


public class SimpleFormat
{
	public static void main(String[] args)
	{
		int x = 5 ;
		double y = 3.1415 ;
		
		System.out.println("Row 1: [" + x + " " + y + "]"); // 旧的方法
		System.out.format("Row 1: [%d %f]\n", x, y) ; // 新的方法
		System.out.printf("Row 1: [%d %f]\n", x, y); // 或者这种方法
	}
}
