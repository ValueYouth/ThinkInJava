package com.valueyouth.typeinfo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wangchi on 2015/12/17.
 * 1. 把Shape对象放入List<Shape>的数组时会向上转型。但同时也丢失了Shape
 *    对象的具体类型。对于数组而言，它们只是Shape类的对象。
 * 2. 从数组中取出元素时，容器会将所有的事物都当作Object持有，会自动将结果
 *    转型回Shape，这事RTTI最基本的使用方式。
 * 3. RTTI的含义：在运行时，识别一个对象的类型。
 */
    abstract class Shape
    {
        void draw()
        {
            System.out.println(this + ".draw()");
        }

        abstract public String toString() ;
    }

    class Circle extends Shape
    {
        public String toString()
        {
            return "Circle" ;
        }
    }

    class Square extends Shape
    {
        public String toString()
        {
            return "Square" ;
        }
    }

    class Triangle extends Shape
    {
        public String toString()
        {
            return "Triangle" ;
        }
    }

    public class Shapes
    {
        public static void main(String[] args)
        {
            List<Shape> shapeList = Arrays.asList(new Circle(), new Square(),
                    new Triangle()) ;

            for ( Shape shape : shapeList )
            {
                shape.draw();
            }
        }
    }
