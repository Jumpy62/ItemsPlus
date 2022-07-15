package fr.silicium.itemsplus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands  implements CommandExecutor {
    public Commands(){

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command");
            return true;
        } else {
            Player player = (Player) sender;
            if (player.hasPermission("op")){
                if (command.getName().equalsIgnoreCase("netheritehammer")){
                    player.getInventory().addItem(ItemManager.Netherite_Hammer);
                }
                if (command.getName().equalsIgnoreCase("ironhammer")) {
                    player.getInventory().addItem(ItemManager.Iron_Hammer);
                }
                if (command.getName().equalsIgnoreCase("invisibilitystick")) {
                    player.getInventory().addItem(ItemManager.Invisibility_stick);
                }
                if (command.getName().equalsIgnoreCase("potionlauncher")) {
                    player.getInventory().addItem(ItemManager.Potion_launcher);
                }
                if (command.getName().equalsIgnoreCase("healcharge")) {
                    player.getInventory().addItem(ItemManager.Heal_charge);
                }



            }
        }
        return true;
    }
}
