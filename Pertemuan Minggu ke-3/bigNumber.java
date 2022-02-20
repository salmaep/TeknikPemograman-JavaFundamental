/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakminggu3;
import java.util.*;
import java.math.*;
/**
 *
 * @author ASUS
 */
public class bigNumber {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        BigInteger angka1;
        BigInteger angka2;
        BigInteger hasilTambah = BigInteger.valueOf(0);
        BigInteger hasilKali = BigInteger.valueOf(0);
        
        angka1 = new BigInteger(keyboard.nextLine());
        angka2 = new BigInteger(keyboard.nextLine());
        
        hasilTambah = hasilTambah.add(angka1);
        hasilTambah = hasilTambah.add(angka2);
        hasilKali = angka1.multiply(angka2);
        
        System.out.println(hasilTambah);
        System.out.println(hasilKali);
    }
}
