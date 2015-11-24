package com.valueyouth.test;


public class StringTest
{
	public static void main(String[] args)
	{
		String s = new String() ;
		System.out.println(("abc").equals(s));
		System.out.println("abc" == s);
		String s1 = (String)null ;
		System.out.println("sbc" instanceof String);
		System.out.println(s1 instanceof String);
	}
}
