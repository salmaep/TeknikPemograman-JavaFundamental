/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus2;

import java.util.*;
/**
 *
 * @author ASUS
 */
public class Restaurant {
    private detailMenu[] menu;
    public static byte id=1;
    
    Scanner s = new Scanner(System.in);
    
    public Restaurant() {
        menu = new detailMenu[10];
        for(int i=0; i<10; i++){
            menu[i] = new detailMenu();
        }
        id = 1;
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.menu[id].setNama_makanan(nama);
        this.menu[id].setHarga_makanan(harga);
        this.menu[id].setStok(stok);
    }

    public int pesanMakanan(){
        int jenisMakanan, id_makanan,jml_makanan ;
        
        System.out.println("");
        System.out.println("==============================");
        System.out.println("      PEMESANAN MAKANAN       ");
        System.out.println("==============================");
        System.out.print("Jumlah Jenis makanan   :");
        jenisMakanan=s.nextInt();
        for(int i=1; i<=jenisMakanan; i++){
            System.out.print("Pilih kode makanan   :");
            id_makanan=s.nextInt();
            System.out.print("Jumlah makanan  :");
            jml_makanan=s.nextInt();
            
            penguranganStok(id_makanan,jml_makanan);
            
        }
        return jenisMakanan;
    }
    
    public void tampilMenuMakanan(){
        System.out.println("");
        System.out.println("==============================");
        System.out.println("       MENU RESTAURANT        ");
        System.out.println("==============================");
        
        for(int i=1; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(i+". "+ menu[i].getNama_makanan() 
                +"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
            }
        }
    }
    
    public void penguranganStok(int id, int jmlPesanan){
        int stok = 0;
        stok = menu[id].getStok() - jmlPesanan;
        menu[id].setStok(stok);
    }
    
    public boolean isOutOfStock(int id){
        if(menu[id].getStok()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
}