/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question01;

/**
 *
 * @author S542263
 */
public class TcsEmployee extends Tcs {
    String level;

    public TcsEmployee(String level) {
        this.level = level;
    }
    

    @Override
    public double employeeSalary() {
        double sal=0;
        if (level.equals("beginer")){
            return 25000;
        }
        else if(level.equals("intermediate"))
        {
            return 50000;
        }
        else{
            return 100000;
        }
    }

    @Override
    public String toString() {
        return "Level is "+level + " and the salary is "+employeeSalary();
    }
    
    
}
