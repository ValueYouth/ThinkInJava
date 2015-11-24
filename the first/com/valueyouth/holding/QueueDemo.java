/**
 * ��LinkedListת��ΪQueue
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
			 * poll()�����ڶ���Ϊ��ʱ������null��
			 * remove()�����ڶ���Ϊ��ʱ���׳�NoSuchElementException��
			 */
			System.out.print(q.poll() + " "); // ��poll()����������
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
		 * ��foreach�ķ����������
		 */
		Queue<Character> qc = new LinkedList<Character>() ;
		
		for (char c : "Wangchi".toCharArray() )
		{
			qc.offer(c) ;
		}
		
		printQ(qc) ;
		
	}
}
