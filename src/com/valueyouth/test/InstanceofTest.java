/**
 * ʱ�䣺2015��10��27��15:50:32
 * Ŀ�ģ�����instaceof�ؼ���
 * @author wangchi
 */
package com.valueyouth.test;

class Animal{}  // ��������Animal
class Cat extends Animal{} // ����Cat���̳�Animal��
class Dog extends Animal{} // ����Dog���̳�Animal��

public class InstanceofTest
{
	public static void check(Cat an) // ���ط���1
	{
		System.out.println("cat...");
	}
	
	public static void check(Dog an) // ���ط���2
	{
		System.out.println("dog...");
	}
	public static void main(String[] args)
	{
		Animal cat = new Cat() ;
		Animal dog = new Dog() ;
		check((Cat)cat) ; // �����cat...
		check((Dog)dog)	; // �����dog... 
	}
}
