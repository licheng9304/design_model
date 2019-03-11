package com.lc.factory_method;

public class SubObject1Factory extends FactoryMethod {
    @Override
    public ParentObject getObject() {
        return new SubObject1();
    }
}
