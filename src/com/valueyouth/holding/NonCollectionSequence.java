/**
 * ������Ѿ��̳��������࣬��ô�Ͳ����ټ̳�AbstractCollection�ˡ�
 * ��ʱ��Ӧ����취���̳кʹ���������������������Ҫ��д������
 * hsaNext(),next(),remove().
 */

package com.valueyouth.holding;

import java.util.Iterator;

import com.valueyouth.typeinfo.pets.Pet;
import com.valueyouth.typeinfo.pets.Pets;


class PetSquence
{
	protected Pet[] pets = Pets.createArray(8) ;
}

public class NonCollectionSequence extends PetSquence
{
	public Iterator<Pet> iterator()
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
		} ;
	}
	
	public static void main(String[] args)
	{
		NonCollectionSequence ncs = new NonCollectionSequence() ;
		InterfaceVsIterator.display(ncs.iterator());
	}
}
