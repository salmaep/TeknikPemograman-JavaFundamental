/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

import java.util.List;

public class Department {
    String name;
    private List<Employee> employee;
    
    Department(String name, List<Employee> employee)
    {
        this.name = name;
        this.employee = employee;
    }
    public List<Employee> getEmployee()
    {
        return employee;
    }
}
