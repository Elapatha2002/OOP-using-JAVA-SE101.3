package com.mycompany.storeobj;
public class StoreObj {

    public static void main(String[] args) {
        //Call getter and setter
        store prod1=new store();
        prod1.setName("Soup");
        prod1.setPrice(150);
        prod1.setQuantityInStock(48);
        prod1.sellproduct(5);
        
        System.out.println("Product Name         : "+prod1.getName());
        System.out.println("Product Price        : "+prod1.getPrice());
        System.out.println("Quantity in stock    : "+prod1.getQuantityInStock());
        System.out.println("New Quantity in stock: "+prod1.CalNewQuantity());
    }
}
