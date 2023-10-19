package com.mycompany.librarysystemobj;
public class ReferenceBook extends Book{
    //Declairing data
    String edition;
    boolean isForReferenceOnly;
    
    //Constructor
    public ReferenceBook(String x,int y,String author,String edition,boolean isForReferenceOnly){
        super(x,y,author); //Call the book class constructor
        this.edition=edition;
        this.isForReferenceOnly=isForReferenceOnly;
    }
    public void displayInfo(){
        System.out.println("This is a reference Book");
    }
    
}
