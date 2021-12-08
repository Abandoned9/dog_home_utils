package com.dimitri.command;

import java.util.Random;

/**
 * @author DimitriYoon
 * @since 2021/11/16 12:23
 */
public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int time = random.nextInt(11) + 5;
        System.out.println("打工了" + time);
        int money = (random.nextInt(6) + 5) * time;
        System.out.println("赚到了"+money+"钱");
    }
}
