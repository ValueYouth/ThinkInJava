/**
 * 如果类已经继承了其他类，那么就不能再继承AbstractCollection了。
 * 此时就应该想办法：继承和创建迭代器。迭代器中需要重写方法：
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
		} ;
	}
	
	public static void main(String[] args)
	{
		NonCollectionSequence ncs = new NonCollectionSequence() ;
		InterfaceVsIterator.display(ncs.iterator());
	}
}
