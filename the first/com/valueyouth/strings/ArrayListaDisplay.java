/**
 * 时间：2015年11月6日15:42:25
 * 目的：ArrayList中调用toString()方法。
 */

package com.valueyouth.strings;

import java.util.ArrayList;

import com.valueyouth.typeinfo.pets.Pet;
import com.valueyouth.typeinfo.pets.Pets;


public class ArrayListaDisplay
{
	public static void main(String[] args)
	{
		ArrayList<Pet> pet = Pets.arrayList(7) ;
		
		System.out.println(pet);
	}
}
