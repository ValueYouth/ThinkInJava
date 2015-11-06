package com.valueyouth.innerclass;

public class Parcel1
{
	class Contents
	{
		private int i = 11 ;
		
		public int value()
		{
			return i ;
		}
	}
	
	class Destination
	{
		private String label ;
		
		public Destination(String whereTo)
		{
			label = whereTo ;
		}
		
		String readLaber()
		{
			return label ;
		}
	}
	
	public void ship(String dest)
	{
		@SuppressWarnings("unused")
		Contents contents = new Contents() ;
		Destination destination = new Destination(dest) ;
		
		System.out.println(destination.readLaber());
	}
	
	public static void main(String[] args)
	{
		Parcel1 parcel1 = new Parcel1() ;
		
		parcel1.ship("Èû°àµº");
	}
}
