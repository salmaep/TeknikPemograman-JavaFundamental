/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticPoymorphism;

class MethodOverloading {
    public static void main (String args[]){
        Overload Obj = new Overload();
        double result;
        Obj.demo(10,10);
        Obj.demo(10);
        result = Obj.demo(5.5);
        System.out.println("O/P : "+ result);
    }
}
