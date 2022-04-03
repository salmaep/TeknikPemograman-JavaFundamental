/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

public class Circle extends Shape{
    private double radius;

    //method get and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {
        radius = r;
    }
    
    public Circle(double r, String c, boolean f) {
        super();
        radius = r;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() { 
        return "A Circle with radius" + radius 
                + ", which is \n" +"a subclass of" 
                + super.toString();
    }
}
