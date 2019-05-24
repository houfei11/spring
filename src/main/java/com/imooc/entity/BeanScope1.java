package com.imooc.entity;

public class BeanScope1 {
    private String scopeName;
    private BeanScope2 beanScope2;

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public BeanScope2 getBeanScope2() {
        return beanScope2;
    }

    public void setBeanScope2(BeanScope2 beanScope2) {
        this.beanScope2 = beanScope2;
    }

    @Override
    public String toString() {
        return "BeanScope1{" +
                "scopeName='" + scopeName + '\'' +
                ", beanScope2=" + beanScope2 +
                '}';
    }
}
