/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class TcsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Abstract class program for question 01");
        System.out.println("Varshith Reddy Bairy");
        System.out.println("================================");
        System.out.println("Please enter your level"
                + "\n1 Beginner"+
                "\n2 Intermediate"+
                "\n3 Advanced");
        Scanner scan = new Scanner(System.in);
        String level = scan.next();
        TcsEmployee emp = new TcsEmployee(level);
        System.out.println(emp.toString());
    }
    
}
