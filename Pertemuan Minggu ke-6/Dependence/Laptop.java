/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependence;

class Laptop {
    public int status;
    
    public void Start(Baterai baterai) 
    { 
        baterai.On();
    } 
    public void Running()
    { 
        System.out.println("Laptop is running...");
    }
    public void Stop(Baterai baterai) 
    { 
        baterai.Off(); 
    }
    
}
