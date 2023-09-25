package com.mycompany.student2obj;
public class student {
    private int AdmNo;
    private String name,batch;
    
    //No parameter constructor
    public student()
    {
        AdmNo=0;
        name="null";
        batch="null";
    }
    public int dis1AdmNo()
    {
        return AdmNo;
    }
    public String dis1Name()
    {
        return name;
    }
    public String dis1Batch()
    {
        return batch;
    }
    
    
    //parameterized constructor
    public student(int a,String n,String b)
    {
        AdmNo=a;
        name=n;
        batch=b;
    }
    public int dis2AdmNo()
    {
        return AdmNo;
    }
    public String dis2Name()
    {
        return name;
    }
    public String dis2Batch()
    {
        return batch;
    }
    
    //setter method
    public void setAdmNo(int a)
    {
        this.AdmNo=a;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setBatch(String b)
    {
        this.batch=b;
    }
    
    //getter Methods
    public int getAdmNo()
    {
        return AdmNo;
    }
    public String getName()
    {
        return name;
    }
    public String getBatch()
    {
        return batch;
    }
    
    //A method to set values using parameters
    public void setData(int a,String n,String b)
    {
       AdmNo=a;
       name=n;
       batch=b;
    }
    public void display()
    {
        System.out.println("Admission number = "+AdmNo);
        System.out.println("Student Name     = "+name);
        System.out.println("Student batch    = "+batch);
    }
}
