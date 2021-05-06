/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question08;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class ExceptionDemo02 {

    /**
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) throws IOException {
        System.out.println("Program for question 08");
        System.out.println("Varshith reddy bairy");
        System.out.println("========================");
        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try{
            if(a<0)
            demoMethod();
            else
            {
                System.out.println("Number is positive");
            }
        }
        catch(Exception e){
            System.out.println(" Negative number exception handled");
        }
    }
    public static void demoMethod() throws IOException{
        throw new IOException("");
    }
}
