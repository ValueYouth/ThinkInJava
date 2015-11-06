/**
 * ʱ�䣺2015��10��30��15:22:57
 * ˵���������������˼�����ҵ�һ�ְ�����
 * Ŀ�ģ������Ƿ�����ʱ��ֻ���׳��ڻ��෽�����쳣
 *       �����б����г����쳣��
 */
package com.valueyouth.exceptions;


@SuppressWarnings("serial")
class BaseballException extends Exception
{
	// ...
}

@SuppressWarnings("serial")
class Foul extends BaseballException
{
	// ...
}

@SuppressWarnings("serial")
class Strike extends BaseballException
{
	// ...
}

abstract class Inning
{
	public abstract void atBat() throws Strike, Foul ;
	
	public Inning() throws BaseballException
	{
		// ...
	}
	
	public void event() throws BaseballException
	{
		// �˴��쳣�׳�����ǿ���û�ȥ��������ڸ��Ǻ�
		// event()�汾�����ӵ��쳣��
	}
	
	public void walk() 
	{
		// �׳������ܼ���쳣
	}
}

@SuppressWarnings("serial")
class StormException extends Exception
{
	// ...
}


@SuppressWarnings("serial")
class RainedOut extends StormException
{
	// ...
}

@SuppressWarnings("serial")
class PopFoul extends Foul
{
	// ...
}

interface Storm
{
	public void event() throws RainedOut ;
	public void rainHard() throws RainedOut ;
}

public class StormyInning extends Inning implements Storm
{
	public StormyInning() throws RainedOut, BaseballException
	{
		// ...
	}
	
	public StormyInning(String s) throws RainedOut, BaseballException
	{
		// ...
	}
	
	public void rainHard() throws RainedOut
	{
		// ...
	}
	
	public void event()
	{
		// ...
	}
	
	public void atBat() throws PopFoul
	{
		// ...
	}
    
	// �þ仰������󡣸���Inning.walk()��û��˵�����쳣�������׳��ˡ�
//	void walk() throws PopFoul{}
	
	public static void main(String[] args) throws RainedOut
	{
		try
		{
			StormyInning si = new StormyInning() ;
			
			si.atBat();
		}
		catch ( PopFoul e )
		{
			System.out.println("pop foul");
		}
		catch ( BaseballException e )
		{
			System.out.println("Generic baseball exception");
		}
		
		
		try
		{
			Inning i = new StormyInning() ;
			i.atBat();
		}
		catch ( Strike e )
		{
			System.out.println("Strike");
		}
		catch ( Foul e )
		{
			System.out.println("Foul");
		}
		catch ( RainedOut e )
		{
			System.out.println("rained out");
		}
		catch ( BaseballException e )
		{
			System.out.println("Generic baseball exception");
		}
	}
}
