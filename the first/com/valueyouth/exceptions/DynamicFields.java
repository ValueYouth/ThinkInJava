/**
 * 时间：2015年10月25日12:08:27
 * 目的：在运行时动态地向DynamicFields对象添加字段
 */
package com.valueyouth.exceptions;


class DynamicFieldsException extends Exception
{
	// 什么都不写
}


public class DynamicFields
{
	private Object[][] fields ;
	
	/**
	 * 带一个参数的构造函数。
	 * @param initialSize a[initialSize][]，数组的长度
	 */
	public DynamicFields(int initialSize)
	{
		fields = new Object[initialSize][2] ;
		
		for ( int i = 0; i < initialSize; i++ )
		{
			fields[i] = new Object[]{null, null} ;
		}
	}
	
	public String toString()
	{
		StringBuilder result = new StringBuilder() ;
		
		for ( Object[] obj : fields )
		{
			result.append(obj[0]) ;
			result.append(": ") ;
			result.append(obj[1]) ;
			result.append("\n") ;
		}
		
		return result.toString() ;
	}
	
	private int hasField(String id)
	{
		for ( int i = 0; i < fields.length; i++ )
		{
			if ( id.equals(fields[i][0]) )
			{
				return i ;
			}
		}
		
		return -1 ;
	}
	
	private int getFieldNumber(String id) throws NoSuchFieldException
	{
		int fieldNum = hasField(id) ;
		
		if ( fieldNum == -1 )
		{
			throw new NoSuchFieldException() ;
		}
		return fieldNum ;
	}
	
	private int makeField(String id)
	{
		for ( int i = 0; i < fields.length; i++ )
		{
			if ( fields[i][0] == null )
			{
				fields[i][0] = id ;
				return i ;
			}
			
			Object[][] tmp = new Object[fields.length + 1][2] ;
			
			for ( int j = 0; j < fields.length; j++ )
			{
				tmp[j] = fields[j] ;
			}
			for ( int k = fields.length; k < tmp.length; k++ )
			{
				tmp[i] = new Object[]{null, null} ;
			}
			
			fields = tmp ;
		}
		
		return makeField(id) ;
	}
	
	public Object getField(String id) throws NoSuchFieldException
	{
		return fields[getFieldNumber(id)][1] ;
	}
	
	public Object setField(String id, Object value)
	        throws DynamicFieldsException
    {
		if ( value == null )
		{
			DynamicFieldsException dfe = new DynamicFieldsException() ;
			dfe.initCause(new NullPointerException()) ;
			
			throw dfe ;
		}
		
		int fieldNumber = hasField(id) ;
		
		if ( fieldNumber == -1 )
		{
			fieldNumber = makeField(id) ;
		}
		
		Object result = null ;
		try
		{
			result = getField(id) ;
		}
		catch ( NoSuchFieldException e)
		{
			throw new RuntimeException(e) ;
		}
		
		fields[fieldNumber][1] = value ;
		return result ;
    }
	
	public static void main(String[] args)
	{
		DynamicFields df = new DynamicFields(3) ;
		
		System.out.println(df);
		
		try
		{
			df.setField("d", "A value for d") ;
			df.setField("number", 47) ;
			df.setField("number2", 48) ;
			System.out.println(df);
			
			df.setField("d", "A value for d") ;
			df.setField("number3", 11) ;
			System.out.println("df:" + df);
			System.out.println("df.getField(\"d\"):" + df.getField("d"));
			
			Object field = df.setField("d", null) ;
		}
		catch ( NoSuchFieldException e )
		{
			e.printStackTrace(System.out);
		}
		catch ( DynamicFieldsException e )
		{
			e.printStackTrace(System.out);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
