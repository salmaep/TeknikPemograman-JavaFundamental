/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakminggu4;

public class Inventori {
    
    Barang[] barangs; // var global
    
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang();
        barangs[1] = new Barang();
        
        barangs[0].setKode_barang("001");
        barangs[0].setNama_barang("Baju");
        barangs[0].setStok(20);
        barangs[1].setKode_barang("002");
        barangs[1].setNama_barang("Celana");
        barangs[1].setStok(30);
    }
    
    void showBarang() {
        System.out.println(barangs[0].getNama_barang() + "(" + barangs[0].getStok() + ")"); 
        System.out.println(barangs[1].getNama_barang() + "(" + barangs[1].getStok() +")");
    }
    
    void pengadaan() {
        initBarang();
        barangs[0].addStok(20);
        showBarang();
    }

    public static void main(String[] args) { 
        Inventori beli = new Inventori(); 
        beli.pengadaan();
    }
}
