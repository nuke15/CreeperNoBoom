package net.maxmushroom.creepernoboom;

import org.bukkit.plugin.java.JavaPlugin;

import net.maxmushroom.creepernoboom.listeners.CreeperListener;
import net.maxmushroom.creepernoboom.listeners.EndermanListener;

public class CreeperNoBoom extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperListener(), this);
        getServer().getPluginManager().registerEvents(new EndermanListener(), this);
    }

}
