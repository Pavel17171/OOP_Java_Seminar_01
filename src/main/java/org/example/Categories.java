package org.example;

import java.util.ArrayList;

public class Categories {
    /**
     * Название категории
     */
    public String nameCategory;
    /**
     * Массив товаров (Products)
     */
    public ArrayList<Products> array;

    public Categories() {
    }

    /**
     * Категория товаров
     *
     * @param nameCategory наимменование категории
     * @param array        массив товаров (Products)
     */
    public Categories(String nameCategory, ArrayList<Products> array) {
        this.nameCategory = nameCategory;
        this.array = array;
    }

    /**
     * Категория товаров
     *
     * @param array массив товаров (Products)
     */
    public Categories(ArrayList<Products> array) {
        this.array = array;
    }

    /**
     * Категория товаров
     *
     * @param nameCategory наимменование категории
     */
    public Categories(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    /**
     * Возвращает информацию о категории товаров
     *
     * @return вывод названия категории и списка товаров (Products) из данной категории
     */
    public String getInfoCategories() {
        String temp = "\n_____" + this.nameCategory + "_____";
        int i = 0;
        for (Products products : array) {
            temp += "\n" + array.get(i);
            i++;
        }
        return String.format(temp);
    }

    /**
     * Возвращает массив товаров категории
     *
     * @return массив товаров (Products) в категории
     */
    public ArrayList getCategoriesArray() {
        return this.array;
    }
}