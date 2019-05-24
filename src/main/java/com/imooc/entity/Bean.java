package com.imooc.entity;

public class Bean {
    private String userName;
    private AnotherBean anotherBean;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public Bean(String userName, AnotherBean anotherBean) {
        this.userName = userName;
        this.anotherBean = anotherBean;
    }
}
