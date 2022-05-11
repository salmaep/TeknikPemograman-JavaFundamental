package com.W11.Tekprog.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass  
public class Book {
    @Id
    private int Id;
    private int Price;

    public Book(int Id, int Price) {
        this.Id = Id;
        this.Price = Price;
    }

    public Book() {
    }

    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    
    }
}