/**
 * ʱ�䣺2015��10��22��08:09:41
 * foreach����������е�Collection��
 */

package com.valueyouth.holding;

import java.util.*;


public class ForEachCollection
{
	public static void main(String[] args)
	{
		Collection<String> cs = new LinkedList<String>() ;
		
		Collections.addAll(cs, "Take the way home".split(" ")) ;
		for ( String s : cs)
		{
			System.out.println(s);
		}
	}
}
