/**
 * 在接口Inteable中，必须实现iterator()方法。
 */

package com.valueyouth.holding;

import java.util.*;


public class IterableClass implements Iterable<String>
{
	protected String[] words = ("I am the best").split(" ") ;
	
	public Iterator<String> iterator()
	{
		return new Iterator<String>(){
			private int index = 0 ;
			
			public boolean hasNext()
			{
				return index < words.length ;
			}
			
			public String next()
			{
				return words[index++] ;
			}
			
			public void remove()
			{
				// 未实现，只抛出异常
				throw new UnsupportedOperationException() ;
			}
		} ;		
	}
	
	public static void main(String[] args)
	{
		for (String s : new IterableClass())
		{
			System.out.println(s) ;
		}
	}
	
	
	
	
	
	
	
	
}
