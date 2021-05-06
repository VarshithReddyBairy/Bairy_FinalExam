/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorable;

import java.util.Scanner;

/**
 *
 * @author S542263
 */
public class GeometricMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program for question 2");
        System.out.println("Varshith Reddy Bairy");
        GeometricObject[] square = new GeometricObject[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0 ;i<5;i++){
            System.out.println("Enter the side");
            double side = scan.nextDouble();
            System.out.println("Enter whether colorable or not");
            boolean isColorable =scan.nextBoolean();
            square[i]= new Square(side,isColorable);
        }
        for(GeometricObject sq : square){
            System.out.println("Area of square is "+sq.area());
            sq.howToColor();
        }
    }
    
}
