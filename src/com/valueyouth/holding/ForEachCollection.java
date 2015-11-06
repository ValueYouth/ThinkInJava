/**
 * 时间：2015年10月22日08:09:41
 * foreach语句用于所有的Collection。
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
