package com.digitalcastaway.warehouse;

import com.digitalcastaway.utils.RobotUtils;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static Product generateProduct() {
        String productName = RobotUtils.generarNombreProducto();
        float productPrice = (float) RobotUtils.generarNumeroAleatorio(200);
        return new Product(productName, productPrice);
    }
}
