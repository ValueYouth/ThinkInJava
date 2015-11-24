package com.valueyouth.strings;

import java.util.Formatter;

/**
 * Created by wangchi on 2015/11/19.
 * 目的：使用“格式修饰符”打印一个购物凭据
 * 记录： 1. 默认右对齐，“-”表示左对齐。如：%-15s表示输出列数是15，左对齐
 *           如果源字符串数大于该数字，则忽略该数字
 *        2. 对浮点数的输出特殊规。例子：%10.2f
 *           10代表这个浮点数的最小宽度是20，2代表浮点数的精度是15，即小数点后
 *           保留15位数字。
 *        3. 对字符串格式化输出的深入理解。例子：%15.15s
 *           第一个15表示这个字符串这个字符串的最小宽度是15
 *           第二个15表示，超出15后，不再显示。
 *           例如“Three Bears Porridge”打印出来后，显示是：Three Bears Por
 *
 */
public class Receipt
{
    private double total = 0 ;
    private Formatter f = new Formatter(System.out) ;

    public void printTitle()
    {
        f.format("%-15s %5s %10s\n", "Item", "Qty", "Price") ;
        f.format("%-15s %5s %10s\n", "----", "---", "-----") ;
    }

    public void print(String name, int qty, double price)
    {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price) ;
        total += price ;
    }

    public void printTotal()
    {
        f.format("%-15s %5s %10.2f\n", "Tax", "", total * 0.06) ;
        f.format("%-15s %5s %10s\n", "", "", "------") ;
        f.format("%-15s %5s %10.2f\n", "Total", " ", total * 1.06) ;
    }

    public static void main(String[] args)
    {
        Receipt receipt = new Receipt() ;

        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
