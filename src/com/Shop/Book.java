package com.Shop;

public class Book {
    String author;
    int id;
    String name;
    int price;

    Book(int id, String name, int price, String author){
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
