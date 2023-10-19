package com.mycompany.companyobj;
public class SalesPerson extends Manager{
    double comRate;
    
    //constructor
    public SalesPerson(String name, int age, String gender, double basicSalary, double bonus,double comRate) {
        super(name, age, gender, basicSalary, bonus);
        this.comRate=comRate;
    }
    
    @Override
    public double calculateSalary() {
        return super.calculateSalary()+super.calculateSalary()*comRate/100;
    }       
    @Override
    public void displayEmployeeDetails() {
        System.out.println("Name           : "+name);
        System.out.println("Age            : "+age);
        System.out.println("Gender         : "+gender);
        System.out.println("Commision rate : "+comRate+"%");
        System.out.println("Salary         : "+calculateSalary());
    }

}
