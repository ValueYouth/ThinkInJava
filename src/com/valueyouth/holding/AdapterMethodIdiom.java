package com.valueyouth.holding;

import java.util.*;


@SuppressWarnings("serial")
class ReversibleArrayList<T> extends ArrayList<T>
{
	public ReversibleArrayList(Collection<T> c)
	{
		super(c) ;
	}
	
	public Iterable<T> reversed()
	{
		return new Iterable<T>(){
			public Iterator<T> iterator(){
				return new Iterator<T>(){
					int current = size() - 1 ;
					
					public boolean hasNext()
					{
						return current > -1 ;
					}
					
					public T next()
					{
						return get(current--) ;
					}
					
					public void remove()
					{
						// δʵ�֣�ֻ�׳��쳣
						throw new UnsupportedOperationException() ;
					}
				} ;			
			} 	
		} ;
	}
}

public class AdapterMethodIdiom
{
	public static void main(String[] args)
	{
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
						Arrays.asList("I am the best".split(" "))) ;
		
		for ( String s : ral)
		{
			System.out.println(s);
		}
		
		for ( String s : ral.reversed() )
		{
			System.out.println(s);
		}
	}
}
