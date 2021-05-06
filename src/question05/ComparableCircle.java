/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question05;

/**
 *
 * @author S542263
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    
    public double radius;

    public ComparableCircle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return (Math.round(Math.PI*radius *radius*100))/100.0;
    }

    @Override
    public int compareTo(ComparableCircle arg0) {
        return Double.compare(this.area(), arg0.area());
    }
    
}
