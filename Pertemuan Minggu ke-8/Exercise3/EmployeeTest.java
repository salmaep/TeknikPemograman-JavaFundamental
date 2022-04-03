/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise3;

public class EmployeeTest{ 
    
    public static void main (String[] args){ 
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
        System.out.println("");
        
        Employee[] staff2 = new Employee[3];
        staff2[0] = new Employee("Hannah", 3000000, 1, 9, 1986);
        staff2[1] = new Employee("Lexa", 2700000, 1, 10, 1990);
        staff2[2] = new Employee("Amber", 1000000, 1, 11, 1999);
        int j;
        for (j = 0; j < 3; j++) staff2[j].raiseSalary(5);
        for (j = 0; j < 3; j++) staff2[j].print();
        
        // add sortable
        System.out.println("\nData after sorting");
        Sortable.shell_sort(staff2);
        for (j = 0; j < 3; j++) staff2[j].print();
    }
    
}

