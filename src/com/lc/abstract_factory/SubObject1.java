package com.lc.abstract_factory;

import com.lc.factory_method.ParentObject;

public class SubObject1 extends ParentObject1 {
    @Override
    public void produce1() {
        System.out.println("create subObject 01");
    }
}
