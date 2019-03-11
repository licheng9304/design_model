package com.lc.factory_method;

public class Test {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new SubObject1Factory();
        ParentObject subObject1 = factoryMethod.getObject();
        subObject1.produce();
    }
}
