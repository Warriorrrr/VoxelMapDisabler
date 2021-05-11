package dev.warriorrr.voxelmapdisabler;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("§3 §6 §3 §6 §3 §6 §e §r §3 §6 §3 §6 §3 §6 §d ");
    }
}
