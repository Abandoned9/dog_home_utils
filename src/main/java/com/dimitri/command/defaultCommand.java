package com.dimitri.command;

import com.dimitri.DogHomeUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.mamoe.mirai.console.command.CommandSenderOnMessage;
import net.mamoe.mirai.console.command.java.JCompositeCommand;
import net.mamoe.mirai.message.data.At;
import net.mamoe.mirai.message.data.MessageChain;
import net.mamoe.mirai.message.data.MessageChainBuilder;

public class defaultCommand extends JCompositeCommand {
    public static final defaultCommand INSTANCE = new defaultCommand();
    public static final ObjectMapper objectMapper = new ObjectMapper();
    public static long callBack = 30000L;

    public defaultCommand() {
        super(DogHomeUtils.INSTANCE,"dhu",new String[]{"狗窝服务工具"},DogHomeUtils.INSTANCE.getParentPermission());
    }

    @SubCommand("自我赞美")
    public void selfPraise(CommandSenderOnMessage sender){
        MessageChain chain = null;
        chain = new MessageChainBuilder()
                .append(new At(sender.getUser().getId()))
                .append("就是一懒狗，是**，是蛆虫，是怪物，是蟑螂，是下水道的老鼠，是淤泥里的蛤蟆，是污水里的水蛭，是粪坑里的苍蝇，是粥里的老鼠屎，是传播病毒的蚊子，是成语里的酒囊饭袋，是俗语里的臭鱼烂虾，是相亲节目里的奇葩嘉宾，是美好婚姻的第三者，是荒淫无度的古代暴君，是沉睡在虚无空间的逃避者，是半醉在生活现实的奉承者，是天上掉馅饼也不抬头的低头族，是夜夜笙歌的纨绔子弟，是十八层地狱中饱受酷刑的恶鬼，是沙漠旅人靴子里的毒蝎，是荒弃老屋里游荡的恶灵，是雨林中的潜伏的毒蛇，是玩物丧志的狺狺之犬，是过街老鼠般的存在，是世界的所有丑与恶的汇集，是世间所有美与好的唾弃者，一想到我和淫鼠羊呼吸着一样的空气我就忍不住隐隐作呕。")
                .build();
        sender.sendMessage(chain);
    }
}
