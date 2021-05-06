/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class InfiniteRecursion02 {
    
    public static void main(String args[]){
        
        System.out.println("Program for question 10");
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Please enter any number for multiples");

        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        isNegative(num);
    }
    public static void isNegative(int num){
        
        if(num < 0){
            
            isNegative(num-1);
        }
        else
        {
            System.out.println(num +" Positive");
            
        }
    }
}
