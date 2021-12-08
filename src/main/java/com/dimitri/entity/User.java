package com.dimitri.entity;

/**
 * @author DimitriYoon
 * @since 2021/11/16 12:38
 */
public class User {
    Integer qq;
    Integer money;
    boolean isWork;

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public boolean isWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }
}
