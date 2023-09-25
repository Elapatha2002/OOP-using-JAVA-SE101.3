package com.mycompany.storeobj;
public class store {
    private String name;
    private double price;
    private int quantityInStock;
    
    
    
    //setter methods
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantityInStock(int quantityInStock)
    {
        this.quantityInStock=quantityInStock;
    }
    
    //getter methods
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantityInStock()
    {
        return quantityInStock;
    }
    
    public void sellproduct(int quantity)
    {
    if(quantity<=quantityInStock){
        quantityInStock=quantityInStock-quantity;
        }
    else{
          System.out.println("Insufficient Products in stock"); 
        }
    }
    
    public int CalNewQuantity()
    {
        return quantityInStock;
    }
    
}
