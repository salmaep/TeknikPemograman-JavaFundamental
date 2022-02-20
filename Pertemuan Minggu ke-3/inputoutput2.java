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
public class inputoutput2 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i<3; i++) {
            String kata = keyboard.next();
            int angka = keyboard.nextInt();
            System.out.format("%-15s%03d%n", kata, angka);
        }
        System.out.println("================================");
    }
}
