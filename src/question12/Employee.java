/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

/**
 *
 * @author S542263
 */
public class Employee implements Comparable<Employee> {
    
    private int empId;
    private String empName;
    private int empSalary;

    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return  empId + " " + empName + " " + empSalary;
    }
    

    @Override
    public int compareTo(Employee emp) {   
        return Integer.compare(this.empId, emp.empId);
        
    }
    
}
