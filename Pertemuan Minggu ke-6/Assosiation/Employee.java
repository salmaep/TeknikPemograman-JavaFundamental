/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assosiation;

public class Employee {
    private String EmployeeSection;

    public String getEmployeeSection() {
        return EmployeeSection;
    }

    public void setEmployeeSection(String EmployeeSection) {
        this.EmployeeSection = EmployeeSection;
    }
    
    @Override
    public String toString(){
        return EmployeeSection;
    }
}
