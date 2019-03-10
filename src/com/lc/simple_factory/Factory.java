package com.lc.simple_factory;

public class Factory {

    public static ProductParent createProductFactoryMethod(Class clazz){
        try {
            Class<?> aClass = Class.forName(clazz.getName());
            ProductParent productParent = (ProductParent)aClass.newInstance();
            return productParent;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
