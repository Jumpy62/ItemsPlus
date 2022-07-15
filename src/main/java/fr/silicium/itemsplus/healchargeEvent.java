package fr.silicium.itemsplus;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class healchargeEvent implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event){
        if (Objects.requireNonNull(Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§heal quand on le mange")){
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 2, 0, true, true));
        }
    }
}