package com.lc.abstract_factory;

import com.lc.factory_method.ParentObject;

public class SubObject2 extends ParentObject2 {
    @Override
    public void produce2() {
        System.out.println("create subObject 02");
    }
}
