package com.lc.abstract_factory;

public class ObjectFactory1$2 implements SubObjectFactory{
    @Override
    public ParentObject1 getSub1() {
        return new SubObject1();
    }

    @Override
    public ParentObject2 getSub2() {
        return new SubObject2();
    }
}
