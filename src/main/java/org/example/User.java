package org.example;

public class User {

    /**
     * Логтн пользователя
     */
    public String login;
    /**
     * Пароль пользователя
     */
    protected String password;
    /**
     * Корзина пользователя
     */
    public Products[] basketUser;

    /**
     * Данные пользователя
     *
     * @param login      логин пользователя
     * @param password   пароль пользователя
     * @param basketUser корзина пользователя
     */
    public User(String login, String password, Products[] basketUser) {
        this.login = login;
        this.password = password;
        this.basketUser = basketUser;
    }

    /**
     * Выводит логин пользователя
     */
    public void getUserLogin() {
        System.out.println("\n_____" + this.login + "_____");
    }
}