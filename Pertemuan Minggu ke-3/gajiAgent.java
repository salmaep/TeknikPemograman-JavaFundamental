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
public class gajiAgent {
    public static void main(String[] args) {
        
       Scanner keyboard = new Scanner(System.in);
       int jmlItem = keyboard.nextInt(); 
       int gajiPokok = 500000;
       int hargaItem = 50000;
       int totalGaji;
       if(jmlItem>=40 && jmlItem<=80){
           totalGaji = gajiPokok+((hargaItem*jmlItem)*25/100);
           System.out.println(totalGaji);
       }else if(jmlItem>80){
           totalGaji = gajiPokok+((hargaItem*jmlItem)*35/100);
           System.out.println(totalGaji);
       }else if(jmlItem<15){
           totalGaji = gajiPokok-((15-jmlItem)*hargaItem*15/100);
           System.out.println(totalGaji);
       }else{
           totalGaji = gajiPokok+((hargaItem*10/100)*jmlItem);
           System.out.println(totalGaji);
       }
    }
}
