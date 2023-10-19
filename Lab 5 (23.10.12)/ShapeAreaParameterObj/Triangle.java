package com.mycompany.shapeobj;
public class Triangle implements Shape{
    public double height,base,side1,side2;
    
    //constructor
    public Triangle(double height,double base,double side1,double side2){
        this.height=height;
        this.base=base;
        this.side1=side1;
        this.side2=side2;
    }
    
    @Override
    public double claculateArea() {
        return 0.5*height*base;
    }
    
    @Override
    public double calculateParameter() {
        return base+side1+side2;
    }
}
