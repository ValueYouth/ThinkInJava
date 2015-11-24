package com.valueyouth.test;


class MyThread extends Thread
{
	public int x = 0 ;
	
	public void run()
	{
		System.out.print(++x + " ");
	}
}

class R implements Runnable
{
	public int x = 0 ;
	
	public void run()
	{
		System.out.print(++x + " ");
	}
}


public class ThreadTest
{
	public static void main(String[] args) throws Exception
	{
		
		for ( int i = 0; i < 10; i++ )
		{
			Thread thread = new MyThread() ;
			
			thread.start();
		}
		System.out.println();
		
		Thread.sleep(1000) ;
		
		R r = new R() ;
		for ( int i = 0; i < 10; i++ )
		{
			Thread t = new Thread(r) ;
			
			t.start();
		}
	}
}
