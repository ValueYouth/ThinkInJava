/**
 * 时间：2015年11月6日11:17:36
 * 目的：1. public final class String
 *       2. String对象是不可变的，也就是“只读”。
 */

package com.valueyouth.strings;


public class Immutable
{
	public static String upcase(String s)
	{
		return s.toUpperCase() ;
	}
	
	public static void main(String[] args)
	{
		String q = "howdy" ;
		System.out.println(q);  // howdy
		
		String qq = upcase(q) ;
		System.out.println(qq); // HOWDY
		System.out.println(q);  // howdy
	}
}
