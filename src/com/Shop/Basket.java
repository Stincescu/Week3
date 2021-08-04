package com.Shop;

public class Basket {

    double totalPrice;
    Basket(Customer customer){
        System.out.println("This is the basket");
    }

    void addBookToBasket(Book book){
        totalPrice = totalPrice + book.price;
    }

    void addCandyToBasket(Candy candy){
        totalPrice = totalPrice + candy.quantity * candy.price;
    }

    double getTotalPrice(Membership membership){
        switch(membership){
            case NO:
                return totalPrice;
            case SILVER:
                return totalPrice - 0.1 * totalPrice;
            case GOLD:
                return totalPrice - 0.2 * totalPrice;
            default:
                return 0;
        }
    }


}
