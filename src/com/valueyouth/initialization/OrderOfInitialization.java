/**
 * ʱ�䣺2015��10��6��12:54:47
 * Ŀ�ģ���֤��ʼ��˳��
 * ����� 1. �̳���ϵ�����о�̬��Ա��ʼ�����ȸ��࣬�����ࣩ
 *        2. �����ʼ������ͨ��Ա�ĳ�ʼ����������ͨ�飩-->���캯���ĵ��ã� 
 *        3. �����ʼ������ͨ��Ա��������ͨ�飩-->���캯����
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
	 * �޲ι��췽��
	 */
	House()
	{
		System.out.println("����Ĺ��췽��...");
		System.out.println("-------------------------------");
	}
	
	Window w1 = new Window("����Ǿ�̬�����ĳ�ʼ����w1") ;        // �Ǿ�̬����
	/**
	 * �Ǿ�̬��
	 */
	{
		System.out.println("����Ǿ�̬��ĳ�ʼ��...");
	}
	
	/**
	 * ��̬��
	 */
	static
	{
		System.out.println("���ྲ̬��ĳ�ʼ��...");
	}
	static Window w2 = new Window("���ྲ̬�����ĳ�ʼ����w2") ; // ��̬����
}

class Bedroom extends House
{
	/**
	 * ���췽��
	 */
	public Bedroom()
	{
		System.out.println("����Ĺ��췽��...");
		System.out.println("-------------------------------");
	}
	
	/**
	 * �Ǿ�̬��
	 */
	{
		System.out.println("����Ǿ�̬��ĳ�ʼ��...");
	}
	Window w1 = new Window("����Ǿ�̬�����ĳ�ʼ����w1") ;        // �Ǿ�̬����
	
	/**
	 * ��̬��
	 */
	static
	{
		System.out.println("���ྲ̬��ĳ�ʼ��...");
	}
	static Window w2 = new Window("���ྲ̬�����ĳ�ʼ����w2") ; // ��̬����
	
}

public class OrderOfInitialization 
{
	public static void main(String[] args) 
	{
		Bedroom b = new Bedroom() ;
		System.out.println(b.toString());
	}
}





