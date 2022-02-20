/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakminggu3;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class berhitung {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       
       String kata = keyboard.nextLine();    
       String[] arrayHitung = kata.split("[ ]");
       int angka1 = Integer.parseInt(arrayHitung[0]);
       int angka2 = Integer.parseInt(arrayHitung[2]);
       String operator = arrayHitung[1];
       
       int hasil;
       if(operator.equals("+")){
           hasil = angka1+angka2;
           System.out.println(hasil);
       }else if (operator.equals("-")){
           hasil = angka1-angka2;
           System.out.println(hasil);
       }else if (operator.equals("*")){
           hasil = angka1*angka2;
           System.out.println(hasil);
       }else if (operator.equals("/")){
           hasil = angka1/angka2;
           System.out.println(hasil);
       }else{
           hasil = angka1%angka2;
           System.out.println(hasil);
       }
    }
}
