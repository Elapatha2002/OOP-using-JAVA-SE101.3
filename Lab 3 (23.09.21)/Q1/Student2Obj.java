package com.mycompany.student2obj;
public class Student2Obj {

    public static void main(String[] args) {
        //Call no parameter constructor
        student d1=new student();
        System.out.println("Admission number = "+d1.dis1AdmNo());
        System.out.println("Student Name     = "+d1.dis1Name());
        System.out.println("Student batch    = "+d1.dis1Batch());
        System.out.println("");
        
        //Call parameterized constructor
        student d2=new student(1001,"Supun","22.1");
        System.out.println("Admission number = "+d2.dis2AdmNo());
        System.out.println("Student Name     = "+d2.dis2Name());
        System.out.println("Student batch    = "+d2.dis2Batch());
        System.out.println("");
        
        //Call getter and setter
        student d3=new student();
        d3.setAdmNo(1002);
        d3.setName("Kavindu");
        d3.setBatch("23.1");
        System.out.println("Admission number = "+d3.getAdmNo());
        System.out.println("Student Name     = "+d3.getName());
        System.out.println("Student batch    = "+d3.getBatch());
        System.out.println("");
        
        //Call set data method with parameters and display method
        student d4=new student();
        d4.setData(1003,"Mihiran","23.2");
        d4.display();
    }
}
