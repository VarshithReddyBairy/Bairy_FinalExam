/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class ThrowsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException{
         System.out.println("Program for question 09");
        System.out.println("Varshith reddy bairy");
        System.out.println("========================");
        System.out.println("Please enter your age");
        Scanner scan = new Scanner(System.in);
        
        int age = scan.nextInt();
        
     
            if(age < 18){
                throw new ArithmeticException("Access denied - You must be at least 18 years old to vote."); 
            }
            else{
                System.out.println("You are eligible to vote");
            }
        
        
    }
    
}
