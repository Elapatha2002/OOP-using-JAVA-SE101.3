package com.mycompany.companyobj;
public abstract class Employee {
    String name;
    int age;
    String gender;
    
    //constructor
    public Employee(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    
    public abstract double calculateSalary(); 
    public abstract void displayEmployeeDetails();
    
}
