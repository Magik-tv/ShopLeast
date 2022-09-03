package com.personal.shopleast.domain;

import java.util.HashMap;

import lombok.Getter;

@Getter
public class Dish {
    private final String name;
    private final HashMap<Product, Integer> productList;

    public Dish(String name) {
        this.name = name;
        this.productList = new HashMap<>();
    }

    public void addProductToProductList(Product product, Integer quantity) {
        productList.put(product, quantity);
    }

    public void deleteProductFromProductList(Product product) {
        productList.remove(product);
    }

    public void editQuantityProductFromProductList(Product product, Integer quantity) {
        productList.remove(product);
        productList.put(product, quantity);
    }

}
