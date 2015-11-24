package com.valueyouth.holding;

import java.util.*;

import com.valueyouth.typeinfo.pets.Pet;
import com.valueyouth.typeinfo.pets.Pets;


public class CollectionSequence extends AbstractCollection<Pet>
{
	private Pet[] pets = Pets.createArray(8) ;
	
	public int size()  // ���󷽷�������ʵ��
	{
		return pets.length ;
	}
	
	public Iterator<Pet> iterator()  // ���󷽷�������ʵ��
	{
		// �����ڲ���
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
				// δʵ�֣�ֻ�׳��쳣
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
