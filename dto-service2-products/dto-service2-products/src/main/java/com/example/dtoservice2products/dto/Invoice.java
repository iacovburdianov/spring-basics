package com.example.dtoservice2products.dto;

import java.util.List;

/**
 * Created by Admin on 5/12/2023
 *
 * @author : Admin
 * @date : 5/12/2023
 * @project : dto-service1-billing
 */
public class Invoice {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
