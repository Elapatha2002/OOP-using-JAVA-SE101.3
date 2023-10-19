package com.mycompany.shapeobj;
public class Rectangle implements Shape{

    public double width,height;
    
    //constructor
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public double claculateArea() {
        return width*height;
    }

    @Override
    public double calculateParameter() {
       return 2*(width+height);
    }
}
