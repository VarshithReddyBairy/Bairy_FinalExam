/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class ThrowExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program for question 09");
        System.out.println("Varshith reddy bairy");
        System.out.println("========================");
        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);
        
       
            try{
                int a = scan.nextInt();
                if(a == (int)a){
            System.out.println("The number is integer");
                
                }
                else
                {
                    throw new InputMismatchException("");
                }
            }
            catch(Exception e){
                System.out.println("Input missmatch exception caught");
            }
        
    }
    
}
