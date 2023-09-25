package com.mycompany.project1;
public class Project1 {

    public static void main(String[] args) {
        Item obj=new Item(1,"Colombo");
        
        int loc=obj.getLocation();
        String des=obj.getDescription();
        
        System.out.println("Location    : "+loc);
        System.out.println("Description : "+des);
    }
}
