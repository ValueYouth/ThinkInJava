/**
 * 时间：2015年10月30日09:26:57
 * 目的：在有finally块的情况下，只需将控制装置的关闭动作
 *       放到该块中即可，无需再try-catch语句中加入对关闭
 *       的处理。
 */

package com.valueyouth.exceptions;

import com.valueyouth.exceptions.Switch.OnOffException1;
import com.valueyouth.exceptions.Switch.OnOffException2;
import com.valueyouth.exceptions.Switch.OnOffSwitch;


public class WithFinally
{
	static Switch sw = new Switch() ;
	
	public static void main(String[] args)
	{
		try
		{
			sw.on() ;
			OnOffSwitch.f();
		}
		catch ( OnOffException1 e )
		{
			System.out.println("OnOffException1");
		}
		catch ( OnOffException2 e )
		{
			System.out.println("OnOffException2");
		}
		finally
		{
			sw.off();
		}
		
		
	}
}	