package com.mycompany.shapeobj;
public class Circle implements Shape{
    public double radius;

    //Constructor
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double claculateArea() {
        return Math.PI*radius*radius;    
    }

    @Override
    public double calculateParameter() {
        return 2*Math.PI*radius;
    }
    
}
