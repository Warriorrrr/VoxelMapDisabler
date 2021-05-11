package dev.warriorrr.voxelmapdisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class VoxelMapDisabler extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
    }
}
