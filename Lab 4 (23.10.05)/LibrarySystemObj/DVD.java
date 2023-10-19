package com.mycompany.librarysystemobj;
public class DVD extends LibraryItem{
    String director;
    //Constructor
    public DVD(String title,int itemId,String director){
        this.title=title;
        this.itemId=itemId;
        this.director=director;
    }
    public void playDVD(){
        System.out.println("Playing the DVD");
    }
}
