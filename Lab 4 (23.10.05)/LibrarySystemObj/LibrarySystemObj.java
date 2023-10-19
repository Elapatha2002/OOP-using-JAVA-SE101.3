package com.mycompany.librarysystemobj;
public class LibrarySystemObj {

    public static void main(String[] args) {
        //Object of book class
        Book book=new Book("Harry Potter",101,"JK Rowlins");
        System.out.println("Book Name           : "+book.title);
        System.out.println("Book Author         : "+book.author);
        System.out.println("Book ID             : "+book.itemId);
        System.out.println("Book is Checked Out : "+book.checkOut());
        book.readBook();
        System.out.println("Book is returned    : "+book.returnItem());
        System.out.println("");
        
        //Object of DVD class
        DVD dvd=new DVD("Intersteller",501,"Crystoper Nolan");
        System.out.println("DVD name           : "+dvd.title);
        System.out.println("DVD Director       : "+dvd.director);
        System.out.println("DVD ID             : "+dvd.itemId);
        System.out.println("DVD is Checked Out : "+dvd.checkOut());
        dvd.playDVD();
        System.out.println("DVD is returned    : "+dvd.returnItem());
        System.out.println("");
        
        //Object of ReferenceBook class
        ReferenceBook refbook=new ReferenceBook(book.title,book.itemId,book.author,"23.15",true);
        System.out.println("Book Name           : "+refbook.title);
        System.out.println("Book Author         : "+refbook.author);
        System.out.println("Book ID             : "+refbook.itemId);
        System.out.println("Book Edition        : "+refbook.edition);
        System.out.println("IsOnlyForReference  : "+refbook.isForReferenceOnly);
        refbook.displayInfo();
    }
    
}
