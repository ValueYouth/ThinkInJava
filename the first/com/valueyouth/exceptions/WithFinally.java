/**
 * ʱ�䣺2015��10��30��09:26:57
 * Ŀ�ģ�����finally�������£�ֻ�轫����װ�õĹرն���
 *       �ŵ��ÿ��м��ɣ�������try-catch����м���Թر�
 *       �Ĵ���
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