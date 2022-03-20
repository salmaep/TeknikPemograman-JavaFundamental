/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assosiation;

import java.util.ArrayList;
import java.util.List;

public class mainAssosiation {
    public static void main(String[] args){
        Company company = new Company();
        company.setCompanyName("Gojek Company");
        
        Employee emplo = new Employee();
        emplo.setEmployeeSection("Back-end Developer Mobile");
        Employee emplo2 = new Employee();
        emplo2.setEmployeeSection("Front-end Developer Mobile");
        
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(emplo);
        empList.add(emplo2);
        
        company.setCompanies(empList);
        
        System.out.println(company.getCompanies()+" are employee section in the "+
                company.getCompanyName());
    }
}
