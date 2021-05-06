/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question07;

import java.util.Scanner;


/**
 *
 * @author S542263
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program for Question07");
        System.out.println("Varshith Reddy Bairy");
        Scanner scan = new Scanner(System.in);
        int[] randArray = new int[100];
        
        for(int i=0 ; i<randArray.length;i++){
            randArray[i]= (int)(Math.random()*100);
        }
        
        System.out.print("Please enter the index to display the corresponding element ");
        int pos = scan.nextInt();
        if(pos >= 0 && pos <= 99)
            System.out.println("The number at "+pos+" is "+randArray[pos]);
        else
            System.out.println("Out of Bounds");
    }
    
}

