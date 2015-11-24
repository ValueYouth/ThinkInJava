/**
 * 多线程--设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1
 */

package com.valueyouth.test;


public class InterviewThread
{
	private int i ;
	
	public synchronized void addition()
	{
		i++ ;
		System.out.println(Thread.currentThread().getName() + 
				"addition:" + i);
	}
	
	public synchronized void subtraction()
	{
		i-- ;
		System.out.println(Thread.currentThread().getName() + 
				"subtraction:" + i);
	}
	
	class Addition implements Runnable
	{
		public void run()
		{
			addition() ;
		}
	}
	
	class Subtraction implements Runnable
	{
		public void run()
		{
			subtraction() ;
		}
	}
	
	public static void main(String[] args)
	{
		InterviewThread it = new InterviewThread() ;
		Addition a = it.new Addition();
		Subtraction s = it.new Subtraction();
		
		Thread thread = null ;
		
		for ( int i = 0; i < 2; i++ )
		{
			thread = new Thread(a) ;
			thread.start();
		}
		
		for ( int i = 0; i < 2; i++ )
		{
			thread = new Thread(s) ;
			thread.start();
		}
	}
}
