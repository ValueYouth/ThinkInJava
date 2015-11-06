package com.valueyouth.holding;

import java.util.*;

import com.valueyouth.typeinfo.pets.Pet;
import com.valueyouth.typeinfo.pets.Pets;


public class CollectionSequence extends AbstractCollection<Pet>
{
	private Pet[] pets = Pets.createArray(8) ;
	
	public int size()  // 抽象方法，必须实现
	{
		return pets.length ;
	}
	
	public Iterator<Pet> iterator()  // 抽象方法，必须实现
	{
		// 匿名内部类
		return new Iterator<Pet>(){
			private int index = 0 ;
			
			public boolean hasNext()
			{
				return index < pets.length ;
			}
			
			public Pet next()
			{
				return pets[index++] ;
			}
			
			public void remove()
			{
				// 未实现，只抛出异常
				throw new UnsupportedOperationException() ;
			}
		};
	}
	
	public static void main(String[] args)
	{
		CollectionSequence cs = new CollectionSequence() ;
		InterfaceVsIterator.display(cs);
		InterfaceVsIterator.display(cs.iterator());
	}
}
