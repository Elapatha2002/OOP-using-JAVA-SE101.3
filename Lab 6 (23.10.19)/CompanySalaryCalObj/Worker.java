package com.mycompany.companyobj;
public class Worker extends Employee{
    double hourlyRate,hoursWorked;

    //constructor
    public Worker(String name, int age, String gender,double hourlyRate,double hoursWorked) {
        super(name, age, gender);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    
    //implement abstract methods
    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println("Worker name   : "+name);
        System.out.println("Worker Age    : "+age);
        System.out.println("Worker Gender : "+gender);
        System.out.println("Hourly Rate   : "+hourlyRate);
        System.out.println("Worked Hours  : "+hoursWorked);
        System.out.println("Salary        : "+calculateSalary());
    }
    
}
