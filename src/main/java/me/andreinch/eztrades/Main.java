package me.andreinch.eztrades;

import lombok.Getter;
import me.andreinch.eztrades.managers.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Getter private static Main instance;
    @Getter private static ConfigManager configManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        configManager = new ConfigManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
