package com.mycompany.companyobj;
public class Manager extends Employee{
    double basicSalary;
    double bonus;

    //constructor
    public Manager(String name, int age, String gender,double basicSalary,double bonus) {
        super(name, age, gender);
        this.basicSalary=basicSalary;
        this.bonus=bonus;
    }
    
    //override abstract methods
    @Override
    public double calculateSalary() {
        return basicSalary+bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Gender : "+gender);
        System.out.println("Bonus  : "+bonus);
        System.out.println("Salary : "+calculateSalary());
    }
    
}
