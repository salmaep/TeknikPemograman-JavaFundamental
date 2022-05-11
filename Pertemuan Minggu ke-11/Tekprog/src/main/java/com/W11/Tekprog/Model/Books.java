package com.W11.Tekprog.Model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Table;
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table(name = "Books")
public class Books extends Book{
@Column  
private String Nama;  
@Column  
private int Kelas;  

public String getNama(){  
return Nama;  
}  
public void setNama(String Nama){  
this.Nama = Nama;  
}  
public int getKelas(){  
return Kelas;  
}  
public void setKelas(int Kelas){  
this.Kelas = Kelas;  
}  

}  
