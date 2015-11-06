/**
 * 时间：2015年10月6日12:54:47
 * 目的：验证初始化顺序
 * 结果： 1. 继承体系的所有静态成员初始化（先父类，后子类）
 *        2. 父类初始化（普通成员的初始化（包括普通块）-->构造函数的调用） 
 *        3. 子类初始化（普通成员（包括普通块）-->构造函数）
 */
package com.valueyouth.initialization;

class Window
{
	Window(String marker)
	{
		System.out.println(marker);
	}
}

class House
{
	
	/**
	 * 无参构造方法
	 */
	House()
	{
		System.out.println("父类的构造方法...");
		System.out.println("-------------------------------");
	}
	
	Window w1 = new Window("父类非静态变量的初始化：w1") ;        // 非静态变量
	/**
	 * 非静态块
	 */
	{
		System.out.println("父类非静态块的初始化...");
	}
	
	/**
	 * 静态块
	 */
	static
	{
		System.out.println("父类静态块的初始化...");
	}
	static Window w2 = new Window("父类静态变量的初始化：w2") ; // 静态变量
}

class Bedroom extends House
{
	/**
	 * 构造方法
	 */
	public Bedroom()
	{
		System.out.println("子类的构造方法...");
		System.out.println("-------------------------------");
	}
	
	/**
	 * 非静态块
	 */
	{
		System.out.println("子类非静态块的初始化...");
	}
	Window w1 = new Window("子类非静态变量的初始化：w1") ;        // 非静态变量
	
	/**
	 * 静态块
	 */
	static
	{
		System.out.println("子类静态块的初始化...");
	}
	static Window w2 = new Window("子类静态变量的初始化：w2") ; // 静态变量
	
}

public class OrderOfInitialization 
{
	public static void main(String[] args) 
	{
		Bedroom b = new Bedroom() ;
		System.out.println(b.toString());
	}
}





