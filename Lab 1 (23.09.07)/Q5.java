package com.mycompany.project2;
public class Project2 {

    public static void main(String[] args) 
    {
        char grade ='A';
        switch(grade)
        {
            case 'A' :
            System.out.println("Excellent!"); break;
            case 'D' :
            System.out.println("You passed");
            case 'F' :
            System.out.println("Better try again");break;
            default :
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade+"\n\n");
        //Output will be Excellent. when u repeat the code removing "break" in line number 6, u will get "Excellent,You passed & Btter try again" as output

        
        //Above code using if,else-if
        if(grade=='A')
        {
            System.out.println("Excellent!");
        }
        else if(grade=='D')
        {
            System.out.println("You passed!");
        }
        else if(grade=='F')
        {
            System.out.println("Better try again!");
        }
        else
        {
            System.out.println("Invalid Grade");
        }
        System.out.println("Your grade is " + grade);
    }
}