package com.mycompany.librarysystemobj;
public class Book extends LibraryItem{
    String author;
    
    //Constructor use for reduce the main code lines. use parameters in object
    public Book(String x,int y,String author){
        title=x;
        itemId=y;
        this.author=author;
     
    }
    public void readBook(){
        System.out.println("Reding the book");
    }
}
