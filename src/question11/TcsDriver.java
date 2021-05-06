/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author S542263
 */
public class TcsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tcs emp1 = new Tcs("SE", "HYD", 25000);
        Tcs emp2 = new Tcs("Manager", "HYD", 100000);
        Tcs emp3 = new Tcs("SE", "Chennai", 25000);
        
        
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Program for Question 11");
        
        System.out.println("*******************");
        System.out.println("Equals method");
        //comparing emp1 and emp2 whether they are equal or not and printing the result
        System.out.println(emp1.equals(emp2));
         //comparing emp2 and emp3 whether they are equal or not and printing the result
        System.out.println(emp1.equals(emp3));
         //comparing emp3 and emp2 whether they are equal or not and printing the result
        System.out.println(emp2.equals(emp3));
        System.out.println("*******************");
        System.out.println("Hash Code");
        //printing the hascode of emp1
        System.out.println(emp1.hashCode());
        //printing the hascode of emp2
        System.out.println(emp2.hashCode());
        //printing the hascode of emp3
        System.out.println(emp3.hashCode());
        System.out.println("*******************");
        
        

    }

}
