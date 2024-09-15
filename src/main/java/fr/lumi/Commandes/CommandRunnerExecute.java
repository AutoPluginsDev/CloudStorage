package fr.lumi.Commandes;
import fr.lumi.Inventories.StorageUnit;
import fr.lumi.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;


public class CommandRunnerExecute implements CommandExecutor, TabCompleter {

    private Main plugin;

    public CommandRunnerExecute(Main plg) {
        plugin = plg;

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String alias, String[] args) {
        List<String> l = new ArrayList<>();
        return l;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(plugin.getUt().replacePlaceHoldersForPlayer("&eHello, &6Agalia&e ! I'm cloudstorage",(Player) sender));
            return true;
        }

        if (args.length == 2){
            if (args[0].equalsIgnoreCase("open")) {
                if (sender instanceof Player) {
                    Player player = (Player) sender;
                    String name = args[1];
                    StorageUnit st = plugin.getCloudStorage().getStorageUnit(name);

                    if (st == null) {
                        player.sendMessage("Storage unit not found with name: " + name);
                        return false;
                    }

                    player.openInventory(st.getInventory());
                    return true;
                }
                return true;
            }
        }

        if (args.length == 2){
            if (args[0].equalsIgnoreCase("create")) {
                String name = args[1];
                plugin.getCloudStorage().createStorageUnit(name);
                return true;
            }
        }

        return true;
    }

}