/**
 * ʱ�䣺2015��11��6��15:42:25
 * Ŀ�ģ�ArrayList�е���toString()������
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
