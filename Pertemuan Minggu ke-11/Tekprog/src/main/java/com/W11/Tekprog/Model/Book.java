package com.W11.Tekprog.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass  
public class Book {
    @Id
    private int NIM;
    private String Gender;

    public Book(int NIM, String Gender) {
        this.NIM = NIM;
        this.Gender = Gender;
    }

    public Book() {
    }

    public int getNIM() {
        return this.NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    
    }
}