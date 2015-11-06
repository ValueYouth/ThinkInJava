/**
 * 时间：2015年10月25日10:07:20
 * 目的：使用Exception类型的一些方法。方法有
 *       getMessage() ; // 获取这个异常的详细信息
 *       getLoacalizedMessage(); // 返回该异常本地化的描述
 *       toString(); // 返回对Throwable的简单描述
 *       printStackTrace(); // 打印Throwable和Throwable的调用轨迹栈
 *       printStackTrace(PrintStream); // 选择输出的流1
 *       printStackTrace(java.io.PrintWriter); // 选择输出的流2
 */

package com.valueyouth.exceptions;


public class ExceptionMethods
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exception("My Exception") ;
		}
		catch ( Exception e )
		{
			System.out.println("Caught the Exception");
			System.out.println("getMessage():" + e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println("toString():" + e);
			e.printStackTrace();
			e.printStackTrace(System.out) ;
		}
	}
}
