/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author S542263
 */
public class Tcs {

    private String designation;
    private String workLocation;
    private double salary;

    public Tcs(String designation, String workLocation, double salary) {
        this.designation = designation;
        this.workLocation = workLocation;
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.designation);
        hash = 43 * hash + Objects.hashCode(this.workLocation);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.salary) ^ (Double.doubleToLongBits(this.salary) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //returns true if we are comparing the same object
        if (this == obj) {
            return true;
        }
        //returns false if the object is null
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Type casting the Super class object to sub class
        final Tcs other = (Tcs) obj;
        //comparing the salary of 2 objects
        if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
            return false;
        }
        //comparing the designation of 2 employee objects
        if (!Objects.equals(this.designation, other.designation)) {
            return false;
        }
        
        return true;
    }
    
    

}
