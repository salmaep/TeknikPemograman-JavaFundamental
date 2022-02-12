/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

/**
 * @author Salma Edyna Putri
 */
class ConvertDataType {
    static short methodOne(long l)
    {
        int i = (int) l;
        System.out.println("\nNilai int : "+i);
        System.out.println("\nNilai short : "+(short) i);
        return (short)i;
    }
    
    public static void main(String[] args)
    {
        double d = 10.98;
        System.out.println("\nNilai double : "+d);
        float f = (float) d; 
        System.out.println("\nNilai float : "+f);
        System.out.println("\nNilai long : "+(long)f);
        byte b = (byte) methodOne((long) f); 
        System.out.println("\nNilai byte : "+b);
    }
}
