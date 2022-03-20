/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

import java.util.List;

class Komputer {
    private final List<CPU> cpu;
    Komputer (List<CPU> cpu)
    {
        this.cpu = cpu;
    }
    public List<CPU> getTotalBooksInLibrary(){
        return cpu;
    }
}
