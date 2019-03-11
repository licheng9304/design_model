package com.lc.factory_method;

public class SubObject1 extends ParentObject {
    @Override
    public void produce() {
        System.out.println("create subObject 01");
    }
}
