/**
 * 时间：2015年10月30日15:22:57
 * 说明：该类的字面意思：激烈的一局棒球赛
 * 目的：当覆盖方法的时候，只能抛出在基类方法的异常
 *       声明列表中列出的异常。
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
		// 此处异常抛出，会强制用户去捕获可能在覆盖后
		// event()版本中增加的异常。
	}
	
	public void walk() 
	{
		// 抛出不接受检查异常
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
    
	// 该句话编译错误。父类Inning.walk()并没有说明该异常，但它抛出了。
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
