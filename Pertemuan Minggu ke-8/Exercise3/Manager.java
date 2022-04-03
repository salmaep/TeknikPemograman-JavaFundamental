/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee implements Sortable{ 
    
    public Manager (String n, double s, int d, int m, int y){ 
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    @Override
    public void raiseSalary(double byPercent){ 
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    public String getSecretaryName(){ 
        return secretaryName;
    }
    
    //instance variabel
    private String secretaryName;
}
