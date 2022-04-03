/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    //method get and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }
    
    public Rectangle(double w, double l, String c, boolean f) {
        super();
        width = w;
        length = l;
    }
    
    public double getArea(){
        return length*width;
    }
    
    public double getPerimeter() {
        return 2*(length+width);
    }
    
    @Override
    public String toString() { 
        return "A Rectangle with width = "+width
                + " and \nlength = "+length
                + ", which is a subclass of "+ super.toString();
    }

}
