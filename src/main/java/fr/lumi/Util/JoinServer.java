package fr.lumi.Util;

import fr.lumi.Main;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;


public class JoinServer implements Listener {
    Main plugin;

    public JoinServer(Main plg) {
        plugin = plg;
    }

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event){
        Player player = event.getPlayer();
        if (player.isOp() || player.hasPermission("acmd.admin"))
        {
            // Todo
            // if (plugin.getConfig().getBoolean("CheckVersion"))
            if (Main.isNewVersionAvailable())
                player.sendMessage(ChatColor.translateAlternateColorCodes(
                        '&',plugin.VerifyPluginVersion()));

        }
    }
}
