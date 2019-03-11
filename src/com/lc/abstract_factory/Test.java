package com.lc.abstract_factory;

import com.lc.factory_method.FactoryMethod;
import com.lc.factory_method.ParentObject;
import com.lc.factory_method.SubObject1Factory;

public class Test {
    public static void main(String[] args) {
        SubObjectFactory factory1$2 = new ObjectFactory1$2();
        ParentObject1 sub1 = factory1$2.getSub1();
        ParentObject2 sub2 = factory1$2.getSub2();
        sub1.produce1();
        sub2.produce2();
    }
}
