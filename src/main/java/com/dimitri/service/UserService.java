package com.dimitri.service;

import com.dimitri.entity.User;
import com.dimitri.mapper.UserMapper;
import net.mamoe.mirai.console.command.CommandSenderOnMessage;
import net.mamoe.mirai.message.data.At;

import java.util.Objects;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author DimitriYoon
 * @since 2021/11/16 12:47
 */
public class UserService {
    private UserMapper userMapper;

    public String doWork(Integer qq, CommandSenderOnMessage sender){
        User user = userMapper.getUserInfo(qq);
        if (user == null){
            userMapper.createUser(qq);
        }
        if (user.isWork()){
            return "你还想打两份工？纯寄吧工具人";
        }
        Random random = new Random();
        int time = random.nextInt(11) + 5;
        int money = (random.nextInt(6) + 5) * time;
        userMapper.lockIsWork(qq);
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                User setUser = userMapper.getUserInfo(qq);
                setUser.setMoney(setUser.getMoney() + money);
                sender.sendMessage(new At(Objects.requireNonNull(sender.getUser()).getId()) + "\n"
                + "本次打工已完成！" + "\n"
                + "本次工资" + money + "\n"
                + "您现在拥有" + userMapper.getAllMoney(qq));
                userMapper.unLockWord(qq);
            }
        }, time * 60000);
        return "打工开始..." + "\n"
                + "预计本次打工" + timer + "分钟" + "\n"
                + "预计工资" + money + "狗窝币";
    }
}
