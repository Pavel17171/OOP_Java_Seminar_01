package org.example;

public class Basket {

    /**
     * Массив товаров
     */
    public Products[] basketArray;

    /**
     * Корзина товаров
     */
    public Basket() {
    }

    /**
     * Корзина товаров
     *
     * @param basketArray массив товаров (Products)
     */
    public Basket(Products[] basketArray) {
        this.basketArray = basketArray;
    }

    /**
     * Выводит информацию по каждому товару (Products) в корзине (basket)
     */
    public void getBasketInfo() {
        for (Products products : basketArray) {
            System.out.println(products.getInfoProducts());
        }
    }
}