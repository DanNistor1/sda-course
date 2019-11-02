package com.sda.patherns.creational.singleton.enum_singleton;

public enum EnumSingleton {

    INSTANCE("Initial enum info");

    private String info;

    // the constructor is private
    EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
