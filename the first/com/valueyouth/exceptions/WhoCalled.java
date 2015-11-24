/**
 * 时间：2015年10月25日10:23:21
 * 目的：验证栈轨迹的调用方法和调用顺序。
 *       1. printStackTrace()方法提供的信息可通过getStackTrace()方法
 *          来直接访问。
 *       2. getStackTrace()方法返回一个有栈轨迹中的元素构成的数组，其
 *          中每个元素都代表栈中的一帧。
 *       3. 元素0(下标)是栈顶元素，栈顶元素是调用序列中的最后一个方法
 *          调用（这个Throwable被创建和抛出之处)。
 */

package com.valueyouth.exceptions;


public class WhoCalled
{
	static void f()
	{
		// 产生一个异常，并填入轨迹栈
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
