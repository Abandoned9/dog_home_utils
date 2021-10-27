package com.dimitri;

import com.dimitri.command.defaultCommand;
import net.mamoe.mirai.console.command.CommandManager;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class DogHomeUtils extends JavaPlugin {
    public static final DogHomeUtils INSTANCE = new DogHomeUtils();

    private DogHomeUtils() {
        super(new JvmPluginDescriptionBuilder("com.dimitri.dog_home_utils", "1.0-SNAPSHOT")
                .name("狗窝服务员")
                .author("狗窝群主DimitriYoon")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("狗窝服务工具已加载!");
        CommandManager.INSTANCE.registerCommand(defaultCommand.INSTANCE,false);
    }
}