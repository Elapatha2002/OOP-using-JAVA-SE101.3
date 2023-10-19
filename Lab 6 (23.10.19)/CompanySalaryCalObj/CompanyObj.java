package com.mycompany.companyobj;
public class CompanyObj {

    public static void main(String[] args) {
        //call manager mathods
        Manager manager=new Manager("Mendis",41,"Male",50000.0,2000.0);
       
        manager.displayEmployeeDetails();
        System.out.println("");
        
        //call Worker methods
        Worker worker=new Worker("Sanduni",26,"Female",250.5,150.0);
       
        worker.displayEmployeeDetails();
        System.out.println("");
        
        //call SalesPerson methods
        SalesPerson sp=new SalesPerson("Piyusha",30,"Female",52000.0,1500.0,6.5);
        sp.calculateSalary();
        sp.displayEmployeeDetails();
    }
}
