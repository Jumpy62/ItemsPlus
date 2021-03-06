package fr.silicium.itemsplus;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class potionlauncherEvent implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event){
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)||event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if (Objects.requireNonNull(Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§9heal un joueur")){
                Short dura = event.getPlayer().getInventory().getItemInMainHand().getDurability();
                Integer durability = dura.intValue() +1;
                if (durability > 131){
                    event.getPlayer().getInventory().remove(event.getPlayer().getInventory().getItemInMainHand());
                }
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1, true, true));
                event.getPlayer().getInventory().getItemInMainHand().setDurability(durability.shortValue());
            }
        }
    }
}
