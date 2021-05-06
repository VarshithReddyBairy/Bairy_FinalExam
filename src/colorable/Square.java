/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorable;

/**
 *
 * @author S542263
 */
public class Square extends GeometricObject implements Colorable{
    
    private double side;
    private boolean isColourable;

    public Square(double side, boolean isColourable) {
        this.side = side;
        this.isColourable = isColourable;
    }
    
    
    @Override
    public void howToColor() {
        if(isColourable)
            System.out.println( "Color All Four Sides");
        else 
            System.out.println("Donot Color");
    }

    @Override
    public double area() {
        return side *side;
    }


    
    
    
}
