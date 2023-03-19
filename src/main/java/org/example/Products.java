package org.example;

public class Products {
    public String nameProducts;
    public double price;
    public double rating;

    public Products() {
    }

    /**
     * Товар
     *
     * @param nameProducts наименование товара
     * @param price        цена товара
     * @param rating       рейтинг товара
     */
    public Products(String nameProducts, double price, double rating) {
        this.nameProducts = nameProducts;
        this.price = price;
        this.rating = rating;
    }

    /**
     * Товар
     *
     * @param nameProducts наименование товара
     * @param price        цена товара
     */
    public Products(String nameProducts, double price) {
        this.nameProducts = nameProducts;
        this.price = price;
    }

    /**
     * Информация о товаре
     *
     * @return возвращает строку с названием, ценой и рейтингом товара
     */
    public String getInfoProducts() {
        return String.format("Товар: %s, цена: %.2f, рейтинг: %.1f",
                this.nameProducts, this.price, this.rating);
    }

    /**
     * @return использует в качестве вывода метод getInfoProducts
     */
    @Override
    public String toString() {
        return getInfoProducts();
    }
}