/**
 * ʱ�䣺2015��11��6��15:53:24
 * Ŀ�ģ�ʹ��toString()������ӡ������ڴ��ַ��
 *       1. ����������
 *          ��InfiniteRecursion���е�toString()����һ����ʹ��
 *          this�ؼ��֡���ʱ�ᷢ���ݹ���ã�����������һ��String
 *          ����������һ����+�������ٺ���Ķ�����String������
 *          ����������ת����һ��String��������this�ϵ�toString()
 *          ���������Ǿͷ����˵ݹ���á�
 *       2. ��ȷ������
 *          Ӧ�õ���Object.toString()�������ڸ����У�Ӧ�õ���
 *          New InfiniteRecursion().toString()��list.toString()
 */

package com.valueyouth.strings;

import java.util.*;


public class InfiniteRecursion
{
/*	public String toString()
	{
		return " InfiniteRecursion address: " + this + "\n" ;
	}
*/	
	public static void main(String[] args)
	{
		List<InfiniteRecursion> list = new ArrayList<InfiniteRecursion>() ;
		
		for ( int i = 0; i < 10; i++ )
		{
			list.add(new InfiniteRecursion()) ;
		}
		
		System.out.println(new InfiniteRecursion().toString()); // �õ�һ���ܳ����쳣��
		System.out.println(list.toString());   // �õ�һ���ܳ����쳣��
	}
}
