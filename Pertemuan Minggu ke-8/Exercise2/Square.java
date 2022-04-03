/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

public class Square extends Rectangle{
    
    public Square() {
        System.out.println("This is square area");
    }

    public Square(double side){
        super(side,side);
    }
    
    public Square(double side, String color, boolean filled) {
        side = side;
        color = color;
        filled = filled;
    }
    
    public double getSide(){
        return (1.0);
    }
    
    public double setSide() {
        return (2.0);
    }
    
    @Override
    public void setWidth(double side) {
        side = side;
    }
    
    @Override
    public void setLength(double side) {
       side = side;
    }
    
    @Override
    public String toString(){
        return "A Square with side = "+ super.getLength()
                + ", which is a subclass \n of " + super.toString();
    } 
    
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return super.getWidth()*super.getWidth();
    }
    @Override
    public double getPerimeter() {
        return 4*super.getWidth();
    }
}
