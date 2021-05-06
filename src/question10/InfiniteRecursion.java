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
public class InfiniteRecursion {
    
    public static void main(String[] args){
        
        System.out.println("Program for Question 10");
        System.out.println("Varshith Reddy Bairy");
        System.out.print("Please enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        display(num);
    }
    public static void display(int num){
        
        if(num == 0)
            System.out.println("Program came to end");
        else
        {
            System.out.println(num);
            display(num-1);
        }
    }
    
}
