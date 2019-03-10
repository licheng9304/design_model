package com.lc.simple_factory;

public class SubProduct2 extends ProductParent {
    @Override
    void createProduct() {
        System.out.println("创建子产品2");
    }
}
