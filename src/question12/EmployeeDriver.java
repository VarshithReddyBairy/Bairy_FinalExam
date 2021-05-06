/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S542263
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Employee> employee = new ArrayList<>();
        Employee emp1 = new Employee(1,"Varshith",10000);
        Employee emp2 = new Employee(5,"Reddy",15000);
        Employee emp3 = new Employee(2,"Sharada",8000);
        Employee emp4 = new Employee(4,"Vineetha",12000);
        Employee emp5 = new Employee(3,"Rasagna",9000);
        
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        employee.add(emp5);
        System.out.println("Varshith Reddy Bairy");
        System.out.println("Program for question 12");
        System.out.println("Original List");
        for(Employee emp : employee){
            System.out.println(emp);
                }
        Collections.sort(employee);
        System.out.println("After Sorting based on id");
        for(Employee emp : employee){
            System.out.println(emp);
                }
          Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee s1, Employee s2) {
                return ((Integer)s1.getEmpSalary()).compareTo(s2.getEmpSalary());
                } 
            
        });
            System.out.println("After sorting based on employee salary");
            for(Employee emp : employee){
            System.out.println(emp);
                }
            Collections.sort(employee, new Comparator<Employee>() {
            @Override
            public int compare(Employee s1, Employee s2) {
                return s1.getEmpName().compareTo(s2.getEmpName());
                } 
            
        });
            System.out.println("After sorting based on employee Name");
            for(Employee emp : employee){
            System.out.println(emp);
                }
            
            
          
    }
    
}
