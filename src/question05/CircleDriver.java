/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Program for question 05");
        System.out.println("Varshith Reddy Bairy");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of first Circle ");
        ComparableCircle c1 = new ComparableCircle(scan.nextDouble());
        System.out.print("Enter radius of second Circle ");
        ComparableCircle c2 = new ComparableCircle(scan.nextDouble());
        System.out.println("===========================================");
        System.out.println("Area of first Circle is " + c1.area());
        System.out.println("Area of Second Circle is " + c2.area());
        System.out.println("===========================================");

        if (c1.compareTo(c2) == -1) {
            System.out.println("Circle 2 has larger area than Circle 1");
        } else {
            System.out.println("Circle 1 has larger area than Circle 2");
        }

    }

}
