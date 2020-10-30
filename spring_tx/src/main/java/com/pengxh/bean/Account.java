package com.pengxh.bean;

public class Account {
    private int uuid;
    private String name;
    private double money;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
