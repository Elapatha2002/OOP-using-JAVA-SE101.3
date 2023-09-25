package com.mycompany.project1;
public class Item 
{
    private int location; 
    private String description;
    
    //Construstor
    public Item(int loc,String des)
    {
        this.location=loc;
        this.description=des;
    }
    //getter and setter methods for location
    public void setLocation(int location){
    this.location=location;
    }
    public int getLocation(){
    return location;
    }
    
    public void setDescription(String description){
    this.description=description;
    }
    public String getDescription(){
    return description;
    }
    
    
}
