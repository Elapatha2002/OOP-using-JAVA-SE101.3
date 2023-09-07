package com.mycompany.project1;
public class Project1 
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println("K.M.P.C.Elapatha");
        System.out.println("23.1 batch");
        System.out.println("\n");
        
        
        //Loop
        for(int i=0;i<5;i++)
        {
            System.out.println("Execution Loop "+i);
        }
        System.out.println("\n");
        
        
        
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers )
        {
         if( x == 30 )
         {
	    break;
         }
         System.out.println( x );
        }
          System.out.println("I’m  out of the Loop now\n");
          //Outputs will be 10 and 20
          //When u using "continue" instead of "break" u won't only get 30 as a output
  
    }
}
