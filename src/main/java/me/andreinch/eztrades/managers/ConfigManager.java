package me.andreinch.eztrades.managers;

import lombok.Getter;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class ConfigManager {
    public ConfigManager(Plugin plugin) {
        this.instance = plugin;
        this.config = saveConfig("config.yml");
        this.messages = saveConfig("messages.yml");
    }

    private FileConfiguration saveConfig(String configName) {
        File file = new File(instance.getDataFolder(), configName);

        if (!file.exists()) {
            instance.saveResource(configName, false);
        }

        return loadConfig(file);
    }

    public FileConfiguration loadConfig(File file) {
        YamlConfiguration configuration = new YamlConfiguration();

        try {
            configuration.load(file);
        } catch (IOException | InvalidConfigurationException ex) {
            ex.printStackTrace();
        }

        return configuration;

    }


    @Getter
    private final FileConfiguration messages;
    @Getter
    private final FileConfiguration config;

    private final Plugin instance;
}