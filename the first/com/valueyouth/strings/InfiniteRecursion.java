/**
 * 时间：2015年11月6日15:53:24
 * 目的：使用toString()方法打印对象的内存地址。
 *       1. 错误做法：
 *          如InfiniteRecursion类中的toString()方法一样，使用
 *          this关键字。此时会发生递归调用：编译器看到一个String
 *          对象后面跟着一个“+”，而再后面的对象不是String，于是
 *          编译器试着转换成一个String——调用this上的toString()
 *          方法，于是就发生了递归调用。
 *       2. 正确做法：
 *          应该调用Object.toString()方法。在该例中，应该调用
 *          New InfiniteRecursion().toString()和list.toString()
 */

package com.valueyouth.strings;

import java.util.*;


public class InfiniteRecursion
{
/*	public String toString()
	{
		return " InfiniteRecursion address: " + this + "\n" ;
	}
*/	
	public static void main(String[] args)
	{
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>() ;
		
		for ( int i = 0; i < 10; i++ )
		{
			list.add(new InfiniteRecursion()) ;
		}
		
		System.out.println(new InfiniteRecursion().toString()); // 得到一串很长的异常。
		System.out.println(list.toString());   // 得到一串很长的异常。
	}
}
