package fr.silicium.itemsplus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack Netherite_Hammer;
    public static ItemStack Iron_Hammer;
    public static ItemStack Invisibility_stick;
    public static ItemStack Potion_launcher;
    public static ItemStack Heal_charge;

    public static void init() {
        createNetherite_Hammer();
        createInvisibility_stick();
        createIron_Hammer();
        createPotion_launcher();
        createHeal_charge();
    }

    private static void createNetherite_Hammer() {
        ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Netherite hammer");
        List<String> lore = new ArrayList<>();
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eMending");
        lore.add("§eEfficiency V");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Netherite_Hammer = item;

        ShapedRecipe netheriteHammer = new ShapedRecipe(NamespacedKey.minecraft("Netherite_hammer"), Netherite_Hammer);
        netheriteHammer.shape("ABA", "CDC", "ABA");
        netheriteHammer.setIngredient('A', Material.PURPUR_BLOCK);
        netheriteHammer.setIngredient('B', Material.NETHERITE_INGOT);
        netheriteHammer.setIngredient('C', Material.NETHER_STAR);
        netheriteHammer.setIngredient('D', Material.NETHERITE_PICKAXE);

        Bukkit.addRecipe(netheriteHammer);
    }

    private static void createIron_Hammer() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Iron Hammer");
        List<String> lore = new ArrayList<>();
        lore.add("§9Mine en 3x3");
        lore.add("§cEnchants :");
        lore.add("§eUnbreaking II");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Iron_Hammer = item;

        ShapedRecipe ironHammer = new ShapedRecipe(NamespacedKey.minecraft("Iron_hammer"), Iron_Hammer);
        ironHammer.shape("ABA", "CDC", "ABA");
        ironHammer.setIngredient('A', Material.RAW_IRON_BLOCK);
        ironHammer.setIngredient('B', Material.GOLD_INGOT);
        ironHammer.setIngredient('C', Material.IRON_BARS);
        ironHammer.setIngredient('D', Material.IRON_PICKAXE);

        Bukkit.addRecipe(ironHammer);
    }

    private static void createInvisibility_stick() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Invisibility stick");
        List<String> lore = new ArrayList<>();
        lore.add("§ Rends totalement invisible");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        item.setItemMeta(meta);
        Invisibility_stick = item;

        ShapedRecipe invisibilityStick = new ShapedRecipe(NamespacedKey.minecraft("Invisibility_stick"), Invisibility_stick);
        invisibilityStick.shape("ABA", "CDC", "ABA");
        invisibilityStick.setIngredient('A', Material.GLASS);
        invisibilityStick.setIngredient('B', Material.GOLDEN_CARROT);
        invisibilityStick.setIngredient('C', Material.FERMENTED_SPIDER_EYE);
        invisibilityStick.setIngredient('D', Material.POTION);

        Bukkit.addRecipe(invisibilityStick);
    }

    private static void createPotion_launcher() {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Potion launcher");
        List<String> lore = new ArrayList<>();
        lore.add("§9heal un joueur");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 2, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Potion_launcher = item;

        ShapedRecipe potionLauncher = new ShapedRecipe(NamespacedKey.minecraft("Potion_launcher"), Potion_launcher);
        potionLauncher.shape("AAA", "ABA", "AAA");
        potionLauncher.setIngredient('A', Material.DIAMOND);
        potionLauncher.setIngredient('B', Material.STICK);

        Bukkit.addRecipe(potionLauncher);

    }

    private static void createHeal_charge() {
        ItemStack item = new ItemStack(Material.APPLE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Heal charge");
        List<String> lore = new ArrayList<>();
        lore.add("§heal quand on le mange");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        Heal_charge = item;

        ShapedRecipe healCharge = new ShapedRecipe(NamespacedKey.minecraft("Heal_charge"), Heal_charge);
        healCharge.shape("XAX", "ABA", "XAX");
        healCharge.setIngredient('A', Material.GLISTERING_MELON_SLICE);
        healCharge.setIngredient('B', Material.SUGAR);

        Bukkit.addRecipe(healCharge);
    }


}

