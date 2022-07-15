package fr.silicium.itemsplus;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class invisibilitystickEvent implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event){
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)){
            if (Objects.requireNonNull(Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§ Rends totalement invisible")){
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 300, 0, true, true));
            }
        }
    }
}
