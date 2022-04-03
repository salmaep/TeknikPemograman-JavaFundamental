/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

public class Shape {
    private String color;
    private boolean filled;
    
    //method get and setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Shape() { // 1st (default) constructor
        color = "green";
        filled = true;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Shape(String c, boolean f) { // 2nd constructor
        color = c;
        filled = f;
    }
 
    public String toString() {
        if(isFilled() == true){
            return "A shape with color of " + color + " and Filled";
        }else{
            return "A shape with color of " + color + " and Not Filled";
        }
    }
}
