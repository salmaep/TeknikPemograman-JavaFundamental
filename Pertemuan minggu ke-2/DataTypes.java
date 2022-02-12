/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;
import java.util.*;

/**
 *
 * @author Salma Edyna Putri
 */
public class DataTypes {
    public static void main(String[] args)
    {
        long max,min;
        max = 9223372036854775807L;
        min = -9223372036854775808L;
        for(int x = 0; x < 5; x = x + 1) {
            Scanner keyboard = new Scanner(System.in);
            double number = keyboard.nextDouble();
            if(number<127 && number>-128){
                System.out.print((long)number +" can be fitted in : \n*Byte\n*Int\n*Short\n*Long\n");
            }
            else if(number<32767 && number>-32768){
                System.out.print((long)number +" can be fitted in : \n*Int\n*Short\n*Long\n");
            }
            else if(number<2147483647 && number>-2147483648){
                System.out.print((long)number +" can be fitted in : \n*Int\n*Long\n");
            }else if(number<max && number>min){
                System.out.print((long)number +" can be fitted in : \n*Long\n");
            }
            else{
                System.out.print(number +" can't be fitted anywhere\n");
            }
        }
    }
    
}
