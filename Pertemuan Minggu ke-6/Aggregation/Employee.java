/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

class Employee {
    private String name;
    private int id ;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    
    Employee(String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    
    public void tampil(){
        System.out.println(getName()+" dengan ID Karyawan "
                +getId()+" berada di departemen "+getDept());
    }
}
