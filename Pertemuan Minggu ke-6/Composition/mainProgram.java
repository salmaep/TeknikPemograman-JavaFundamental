/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

import java.util.ArrayList;
import java.util.List;

class mainProgram {
    public static void main (String[] args)
    {
        CPU c1 = new CPU("Intel Processor", "Intel Core i7");
        CPU c2 = new CPU("AMD (Anvanced Micro Processor)", "AMD Phenom II X6");
        CPU c3 = new CPU("ARM Processor", "Nvidia Tegra");

        List<CPU> cpu = new ArrayList<CPU>();
        cpu.add(c1);
        cpu.add(c2);
        cpu.add(c3);
        
        Komputer komputer = new Komputer(cpu);
        List<CPU> cp = komputer.getTotalBooksInLibrary();
        for(CPU c : cp){
            System.out.println("Merek : " + c.merek + " -- "
            +" Versi : " + c.versi);
        }
    }
}