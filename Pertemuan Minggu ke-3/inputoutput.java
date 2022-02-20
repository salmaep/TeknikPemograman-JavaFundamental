/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakminggu3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class inputoutput {
 
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String kata = keyboard.nextLine();    
        String[] stringArray = kata.split("[!,?._'@ ]");
        
        int tokenKata = stringArray.length;
        System.out.println(tokenKata);
        for( int i=0; i<tokenKata;i++){
            System.out.println(stringArray[i]);
    }
    }
      
    
}
