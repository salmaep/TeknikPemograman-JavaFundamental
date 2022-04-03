/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

public class mainShape {
    public static void main (String[] args) {
        
    // Declare and allocate a new instance of cylinder
    // with default color, radius, and height
    Circle c1 = new Circle();
    System.out.println("Circle: " 
            + " radius=" + c1.getRadius() 
            + " base area=" + c1.getArea() 
            + " volume=" + c1.getPerimeter());
    System.out.println(c1.toString());
    System.out.println("");

    // Declare and allocate a new instance of cylinder
    // specifying height, with default color and radius
    Rectangle c2 = new Rectangle(10.0,20.0);
    System.out.println("Rectangle:" 
            + " radius=" + c2.getWidth() 
            + " height=" + c2.getLength()
            + " base area=" + c2.getArea() 
            + " volume =" + c2.getPerimeter());
    System.out.println(c2.toString());
    System.out.println("");

    // Declare and allocate a new instance of cylinder
    // specifying radius and height, with default color
    Square s = new Square(3.0);
       System.out.println("Square:"  
                + " base area=" + s.getArea());
        System.out.println(s.toString());
        System.out.println("");
    }
}