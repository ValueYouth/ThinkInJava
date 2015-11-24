/**
 * 优先队列声明下一个弹出元素是最需要的元素。
 * 使用offer()方方法添加元素时，会自动排序（从小到大）。
 */

package com.valueyouth.holding;

import java.util.*;

public class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> priorityQueue = 
				new PriorityQueue<Integer>() ;
		Random rand = new Random(35) ;
		
		for ( int i = 0; i < 10; i++ )
		{
			priorityQueue.offer(rand.nextInt(i + 10)) ;
		}
		QueueDemo.printQ(priorityQueue);
		
		/**
		 *  priorityQueue继承结构：
		 *  priorityQueue <- AbstractQueue <- AbstractCollection <- Collection <- Iterable
		 */
		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 
				1, 1, 2, 3, 9, 14, 18, 21, 23, 25) ;
//		System.out.println(ints.get(3)) ;
		priorityQueue = new PriorityQueue<Integer>(ints) ;
		QueueDemo.printQ(priorityQueue) ;
		
		priorityQueue = new PriorityQueue<Integer>(ints.size(),
				Collections.reverseOrder()) ;
		priorityQueue.addAll(ints) ;
		QueueDemo.printQ(priorityQueue) ;
		
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION" ;
		List<String> strings = Arrays.asList(fact.split(" ")) ;
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings) ;
		QueueDemo.printQ(stringPQ) ;
		
		stringPQ = new PriorityQueue<String>(strings.size(),
				Collections.reverseOrder()) ;
		QueueDemo.printQ(stringPQ) ;
		
		
		Set<Character> charSet = new HashSet<Character>() ;
		for ( char c : fact.toCharArray() )
		{
			charSet.add(c) ;
		}
		PriorityQueue<Character> charPQ = 
				new PriorityQueue<Character>(charSet) ;
		QueueDemo.printQ(charPQ);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
