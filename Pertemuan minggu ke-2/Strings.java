/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal6;
import java.util.*;
/**
 *
 * @author Salma Edyna Putri
 */
public class Strings {
    public static void main(String[] args)
    {   
        Scanner keyboard = new Scanner(System.in);
        String kata1 = keyboard.nextLine();
        String kata2 = keyboard.nextLine();
        
        int sum = kata1.length()+kata2.length();
        System.out.println(sum);
        System.out.println( (kata1.compareTo(kata2) > 0) ? "Yes" : "No");
        System.out.println(
            kata1.substring(0,1).toUpperCase() + kata1.substring(1) + " " +
            kata2.substring(0,1).toUpperCase() + kata2.substring(1)
        );
    }
}
