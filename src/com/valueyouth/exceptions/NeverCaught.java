/**
 * 时间：2015年10月30日08:47:39
 * 目的：不捕获RuntimeException异常，会发生什么事呢？
 * 结果：编译器对该异常说明不进行强制检查，RuntimeException类型
 *       的异常会穿越所有的执行路径直达main()方法，不会被捕获。
 *       在程序退出前，将调用异常的printStackTrace()方法。
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
