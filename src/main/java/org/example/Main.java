package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Создание товаров
        Products Asus = new Products("Asus", 55754.50, 7.8);
        Products Acer = new Products("Acer", 53147.45, 5.6);
        Products Lenovo = new Products("Lenovo", 49147.45, 6.3);
        Products HP = new Products("HP", 39150.75, 5.3);
        Products Digma = new Products("Digma", 19200.05, 4.6);
        Products IPhone = new Products("IPhone", 120000.70, 8.3);
        Products Honor = new Products("Honor", 33000.00, 7.7);
        Products Oppo = new Products("Oppo", 27150.15, 5.8);
        Products Xiaomi = new Products("Xiaomi", 27150.15, 5.8);
        Products Sony = new Products("Sony", 2500.00, 8.8);
        Products JBL = new Products("JBL", 3500.50, 7.5);
        Products Razer = new Products("Razer", 5120.10, 6.3);

        //---------------------------------------------------------------------------

        // Сортировка товарам по массивам для категорий
        ArrayList<Products> laptopsArray = new ArrayList<Products>();
        laptopsArray.add(Asus);
        laptopsArray.add(Acer);
        laptopsArray.add(Lenovo);
        laptopsArray.add(HP);
        laptopsArray.add(Digma);

        ArrayList<Products> smartphoneArray = new ArrayList<Products>();
        smartphoneArray.add(IPhone);
        smartphoneArray.add(Honor);
        smartphoneArray.add(Oppo);
        smartphoneArray.add(Xiaomi);

        ArrayList<Products> headphonesArray = new ArrayList<Products>();
        headphonesArray.add(Sony);
        headphonesArray.add(JBL);
        headphonesArray.add(Razer);

        //---------------------------------------------------------------------------

        // Формирование категорий на основании массивов товаров
        Categories Laptops = new Categories("Laptops", laptopsArray);
        Categories Smartphone = new Categories("Smartphone", smartphoneArray);
        Categories Headphones = new Categories("Headphones", headphonesArray);

        //---------------------------------------------------------------------------

        // Создание полного каталога товаров
        Categories[] Catalog = {Laptops, Smartphone, Headphones};
        getCatalog(Catalog, "Начальный каталог товаров", '*');

        //---------------------------------------------------------------------------

        printBanner("Корзины пользователей", '*');

        // Формирование корзин пользователей
        Products[] basket1 = {Asus, Honor, JBL};
        User user1 = new User("User-One", "asda", basket1);
        basketOfUser(basket1, user1, Catalog);

        Products[] basket2 = {IPhone, Sony};
        User user2 = new User("User-Two", "asd", basket1);
        basketOfUser(basket2, user2, Catalog);

        Products[] basket3 = {Lenovo};
        User user3 = new User("User-Three", "qwerty", basket1);
        basketOfUser(basket3, user3, Catalog);

        // Вывод каталога с остатками товаров
        getCatalog(Catalog, "Остаток в магазине", '*');

    }

    /**
     * Вывод каталога товаров по категориям
     *
     * @param Catalog какой каталог
     * @param text    текст баннера (заголовка)
     * @param symbol  символ обрамления баннера
     */
    public static void getCatalog(Categories[] Catalog, String text, Character symbol) {
        System.out.println("\n///////////////////////////////////////////");
        printBanner(text, symbol);
        for (Categories categories : Catalog) {
            System.out.println(categories.getInfoCategories());
        }
        System.out.println("\n///////////////////////////////////////////");
    }

    /**
     * Печать баннера (текст с обрамлением)
     *
     * @param s      текст баннера
     * @param symbol символ обрамления баннера
     */
    public static void printBanner(String s, Character symbol) {
        int count = s.length() + 4;
        System.out.println();
        System.out.println(String.format("%" + count + "s", "").replace(' ', symbol));
        System.out.println(symbol + " " + s + " " + symbol);
        System.out.println(String.format("%" + count + "s", "").replace(' ', symbol));
    }

    /**
     * Корзина пользователя
     *
     * @param basket  корзина пользователя
     * @param user    логин пользователя
     * @param Catalog из какого каталога будут удалены товары
     */
    public static void basketOfUser(Products[] basket, User user, Categories[] Catalog) {
        Basket bask = new Basket(basket);
        user.getUserLogin();
        bask.getBasketInfo();
        double sum = 0;
        for (Products products : basket) {
            sum += products.price;
        }
        System.out.println("_________________");
        System.out.printf("Сумма заказа: %.2f" + " руб." + "\n", sum);
        for (Categories categories : Catalog) {
            for (Products products : basket) {
                (categories.getCategoriesArray()).remove(products);
            }
        }
    }
}