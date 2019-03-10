package com.lc.simple_factory;

public class Test {
    public static void main(String[] args) {
        ProductParent productFactoryMethod = Factory.createProductFactoryMethod(SubProduct1.class);
        productFactoryMethod.createProduct();
    }
}
