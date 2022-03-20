/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

import java.util.List;

class Company {
    String companyName;
    private List<Department> departments;
    Company(String companyName, List<Department> departments)
    {
        this.companyName = companyName;
        this.departments = departments;
    }

    public int getTotalEmployeeInCompany()
    {
        int noOfEmployee = 0;
        List<Employee> employee;
        for(Department dept : departments)
        {
            employee = dept.getEmployee();
            for(Employee emp : employee)
            {
                noOfEmployee++;
            }
        }
    return noOfEmployee;
    }
}
