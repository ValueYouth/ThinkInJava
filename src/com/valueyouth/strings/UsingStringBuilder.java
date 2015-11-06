/**
 * 时间：2015年11月6日11:24:25
 * 目的：当为一个类编写toString()方法时，
 *       1. 简单字符串操作，交给编译器处理
 *       2. 方法中使用循环，最好自己创建一个StringBuileder对象。
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
