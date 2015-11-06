/**
 * 将LinkedList转型为Queue
 * @author wangchi
 *
 */

package com.valueyouth.holding ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo
{
	public static void printQ(@SuppressWarnings("rawtypes") Queue q)
	{
		while ( q.peek() != null )
		{
			/**
			 * poll()方法在队列为空时，返回null；
			 * remove()方法在队列为空时，抛出NoSuchElementException。
			 */
			System.out.print(q.poll() + " "); // 与poll()方法的区别
		}
		
//		System.out.println(q.remove());
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<Integer>() ;
		
		Random random = new Random(35) ;
		for ( int i = 0; i < 10; i++ )
		{
			q.offer(random.nextInt(i + 10)) ;
		}
		
		printQ(q) ;
		
		/**
		 * 用foreach的方法进行输出
		 */
		Queue<Character> qc = new LinkedList<Character>() ;
		
		for (char c : "Wangchi".toCharArray() )
		{
			qc.offer(c) ;
		}
		
		printQ(qc) ;
		
	}
}
