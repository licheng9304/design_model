package com.lc.factory_method;

public class SubObject2Factory extends FactoryMethod {
    @Override
    public ParentObject getObject() {
        return new SubObject2();
    }
}
