package com.imooc.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Bean {
    private String userName;
    private AnotherBean anotherBean;

    private List<String> stringList;
    private List<AnotherBean> anotherBeanList;

    private Set<String> stringSet;
    private Set<AnotherBean> anotherBeanSet;

    private Map<String, String> stringMap;
    private Map<AnotherBean,AnotherBean> anotherBeanMap;

    private Properties properties;
    private AnotherBean anotherBean2;

    public AnotherBean getAnotherBean2() {
        return anotherBean2;
    }

    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public List<AnotherBean> getAnotherBeanList() {
        return anotherBeanList;
    }

    public void setAnotherBeanList(List<AnotherBean> anotherBeanList) {
        this.anotherBeanList = anotherBeanList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Set<AnotherBean> getAnotherBeanSet() {
        return anotherBeanSet;
    }

    public void setAnotherBeanSet(Set<AnotherBean> anotherBeanSet) {
        this.anotherBeanSet = anotherBeanSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    public Map<AnotherBean, AnotherBean> getAnotherBeanMap() {
        return anotherBeanMap;
    }

    public void setAnotherBeanMap(Map<AnotherBean, AnotherBean> anotherBeanMap) {
        this.anotherBeanMap = anotherBeanMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

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

    @Override
    public String toString() {
        return "Bean{" +
                "userName='" + userName + '\'' +
                ", anotherBean=" + anotherBean +
                ", stringList=" + stringList +
                ", anotherBeanList=" + anotherBeanList +
                ", stringSet=" + stringSet +
                ", anotherBeanSet=" + anotherBeanSet +
                ", stringMap=" + stringMap +
                ", anotherBeanMap=" + anotherBeanMap +
                ", properties=" + properties +
                '}';
    }
}
