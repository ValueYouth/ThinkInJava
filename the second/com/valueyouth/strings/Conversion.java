package com.valueyouth.strings;

import java.math.BigInteger;
import java.util.Formatter;

/**
 * Created by wangchi on 2015/11/24.
 */
public class Conversion
{
    public static void main(String[] args)
    {
        Formatter f = new Formatter(System.out) ;
/*
        char u = 'a' ;
        System.out.println("u = 'a");
        f.format("s: %s\n", u) ;
        f.format("c: %c\n", u) ; // Unicode字符
        f.format("b: %b\n", u) ; // 输出：b: true
        f.format("h: %h\n", u) ; // 散列码，输出：h: 61
//        f.format("d: %d\n", u) ; // 异常：IllegalFormatConversionException

        int v = 121 ;
        System.out.println("v = 121") ;
        f.format("d: %d\n", v) ;
        f.format("c: %c\n", v) ; // 输出：c: y
        f.format("s: %s\n", v) ;
        f.format("b: %b\n", v) ; // 输出：b: true
        f.format("x: %x\n", v) ; // 输出：x: 79
        f.format("h: %h\n", v) ;
//        f.format("f: %f\n", v) ; // 异常：IllegalFormatConversionException
//        f.format("e: %e\n", v) ; // 异常：IllegalFormatConversionException
*/

        BigInteger w = new BigInteger("5000000000000") ;
        System.out.println("BigInteger w = new BigInteger(\"5000000000000\") ") ;

    }
}
