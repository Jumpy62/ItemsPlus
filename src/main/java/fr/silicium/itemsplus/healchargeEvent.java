package fr.silicium.itemsplus;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.List;
import java.util.Objects;

public class healchargeEvent implements Listener {

    @EventHandler
    public void onEat(PlayerItemConsumeEvent event){
            if (Objects.requireNonNull(Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("§heal quand on le mange")))){
                event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 2, 0, true, true));
            }}

    }