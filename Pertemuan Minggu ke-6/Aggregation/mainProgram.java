/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class mainProgram {
    public static void main (String[] args)
    {
    Employee emp1 = new Employee("Amel", 5236256, "SDA");
    Employee emp2 = new Employee("Helsa", 5276256, "SDA");
    Employee emp3 = new Employee("Salma", 1236256, "KOMINFO");
    Employee emp4 = new Employee("Tabitha", 7656256, "KOMINFO");
    Employee emp5 = new Employee("Falia", 3625611, "KOMINFO");
    
    // making a List of
    // CSE Students.
    List <Employee> sda_employee = new ArrayList<Employee>();
    sda_employee.add(emp1);
    sda_employee.add(emp2);
    
    // making a List of
    // EE Students
    List <Employee> kominfo_employee = new ArrayList<Employee>();
    kominfo_employee.add(emp3);
    kominfo_employee.add(emp4);
    kominfo_employee.add(emp5);
    
    Department SDA = new Department("CSE", sda_employee);
    Department KOMINFO = new Department("EE", kominfo_employee);
    
    List <Department> departments = new ArrayList<Department>();
    departments.add(SDA);
    departments.add(KOMINFO);
    
    // creating an instance of Institute.
    Company company = new Company("GOJEK", departments);
    System.out.print("Total employee in company: ");
    System.out.print(company.getTotalEmployeeInCompany());
    System.out.println("\n");
    
    emp1.tampil();
    emp2.tampil();
    emp3.tampil();
    emp4.tampil();
    }
}