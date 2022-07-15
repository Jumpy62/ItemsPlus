package fr.silicium.itemsplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        ItemManager.init();

        this.getCommand("netheritehammer").setExecutor(new Commands());
        this.getCommand("ironhammer").setExecutor(new Commands());
        this.getCommand("invisibilitystick").setExecutor(new Commands());
        this.getCommand("potionlauncher").setExecutor(new Commands());
        this.getCommand("healcharge").setExecutor(new Commands());


        this.getServer().getPluginManager().registerEvents(new hammerEvent(), this);
        this.getServer().getPluginManager().registerEvents(new invisibilitystickEvent(), this);
        this.getServer().getPluginManager().registerEvents(new potionlauncherEvent(), this);
        this.getServer().getPluginManager().registerEvents(new healchargeEvent(), this);



    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
