/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assosiation;

import java.util.List;

public class Company {
    private String companyName;
    List<Employee> companies;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public List<Employee> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Employee> companies) {
        this.companies = companies;
    }
}

