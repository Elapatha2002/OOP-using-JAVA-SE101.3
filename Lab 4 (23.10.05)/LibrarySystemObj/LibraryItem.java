package com.mycompany.librarysystemobj;
public class LibraryItem {
    //Describing data
    String title;
    int itemId;
    boolean isCheckedOut; 
    
    public boolean checkOut(){
        isCheckedOut=true;
        return isCheckedOut; 
    }
    public boolean returnItem(){
        return isCheckedOut=false;
    }
}
