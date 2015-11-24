/**
 * 时间：2015年10月27日15:50:32
 * 目的：测试instaceof关键字
 * @author wangchi
 */
package com.valueyouth.test;

class Animal{}  // 公共父类Animal
class Cat extends Animal{} // 子类Cat，继承Animal类
class Dog extends Animal{} // 子类Dog，继承Animal类

public class InstanceofTest
{
	public static void check(Cat an) // 重载方法1
	{
		System.out.println("cat...");
	}
	
	public static void check(Dog an) // 重载方法2
	{
		System.out.println("dog...");
	}
	public static void main(String[] args)
	{
		Animal cat = new Cat() ;
		Animal dog = new Dog() ;
		check((Cat)cat) ; // 输出：cat...
		check((Dog)dog)	; // 输出：dog... 
	}
}
