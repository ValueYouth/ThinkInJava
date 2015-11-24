/**
 * 时间：2015年10月30日09:23:35
 * 目的：在没有finally块的情况下，对外界开关的处理情况。
 */

package com.valueyouth.exceptions;


public class Switch
{
	private boolean state ;  // 默认初始化为false
	
	public boolean read()
	{
		return state ;
	}
	
	public void on()
	{
		state = true ;
		System.out.println(state);
	}
	
	public void off()
	{
		state = false ;
		System.out.println(state);
	}
	
	public String toString()
	{
		return state ? "on" : "off" ;
	}
	
	public class OnOffException1 extends Exception
	{
		// ...
	}
	
	public class OnOffException2 extends Exception
	{
		// ...
	}
	
	public static class OnOffSwitch
	{
		private  static Switch sw = new Switch() ;
		
		public static void f() throws OnOffException1, OnOffException2
		{
			// ...
		}
		
		public static void main(String[] args) throws OnOffException2
		{
			try
			{
				sw.on() ;  // 打开开关
				f() ;
				sw.off() ;
			}
			catch ( OnOffException1 e )
			{
				System.out.println("OnOffException1");
				sw.off();
			}
			catch ( OnOffException2 e )
			{
				System.out.println("OnOffException2");
				sw.off();
			}
		}
	}
}
