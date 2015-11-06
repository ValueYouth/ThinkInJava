/**
 * ʱ�䣺2015��10��30��09:23:35
 * Ŀ�ģ���û��finally�������£�����翪�صĴ��������
 */

package com.valueyouth.exceptions;


public class Switch
{
	private boolean state ;  // Ĭ�ϳ�ʼ��Ϊfalse
	
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
				sw.on() ;  // �򿪿���
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
