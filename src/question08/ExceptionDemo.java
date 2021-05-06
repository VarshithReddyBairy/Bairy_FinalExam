/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S542263
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        System.out.println("Program for question 08");
        System.out.println("Varshith reddy bairy");
        System.out.println("========================");
        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a==1){
            try {
                throw new IOException();
        } catch (IOException ex) {
                System.out.println("Exception caught "+ex);
        }
    }
        else 
            System.out.println("the number is "+a);
    }
   
    
}
