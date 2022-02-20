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
public class bukaTutupJalan {
    public static void main(String[] args) {
        
       Scanner keyboard = new Scanner(System.in);
       int mobil[] = new int[4];
       
       // input plat mobil
       for(int i = 0; i < mobil.length; i++){
           mobil[i] = keyboard.nextInt();
       }
       
       // ubbah Array to string , replaceAll untuk menghilangkan kurung siku dan spasi yang ada pada array
       String strPlat = Arrays.toString(mobil).replaceAll("[\\[\\], ]", "");
       
       // ubah String to long 
       long platGabungan = Long.parseLong(strPlat);
       
       // cek kondisi
       if((platGabungan - 999999) % 5 == 0){
           System.out.println("berhenti");
       }else{
           System.out.println("jalan");
       }
    }
}
