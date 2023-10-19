package com.mycompany.shapeobj;
public class ShapeObj {

    public static void main(String[] args) {
        Circle c=new Circle(7);
        System.out.println("Area of circle      = "+c.claculateArea());
        System.out.println("Parameter of Circle = "+c.calculateParameter());
        System.out.println("");
        
        Rectangle r=new Rectangle(10,20);
        System.out.println("Area of Rectangle      = "+r.claculateArea());
        System.out.println("Parameter of Rectangle = "+r.calculateParameter());
        System.out.println("");
        
        Triangle t=new Triangle(10,2,4,3);
        System.out.println("Area of Triangle      = "+t.claculateArea());
        System.out.println("Parameter of Triangle = "+t.calculateParameter());
    }
}
