package fr.silicium.itemsplus;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class hammerEvent implements Listener {

    BlockFace blockface = null;


    @EventHandler
    public void onClick(PlayerInteractEvent event){
        if (event.getAction().equals(Action.LEFT_CLICK_BLOCK)){
            blockface = event.getBlockFace();
        }
    }
    public void casser(Block block){
            if (block.getType().equals(Material.BEDROCK)){}
            else{
            block.breakNaturally();}
        }


    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        if (Objects.requireNonNull(Objects.requireNonNull(event.getPlayer().getInventory().getItemInMainHand().getItemMeta()).getLore()).contains("§9Mine en 3x3")){
            if (blockface.equals(BlockFace.UP) || blockface.equals(BlockFace.DOWN)) {

                Block block1 = block.getRelative(BlockFace.EAST);
                Block block2 = block.getRelative(BlockFace.WEST);
                Block block3 = block.getRelative(BlockFace.NORTH);
                Block block4 = block.getRelative(BlockFace.SOUTH);
                Block block5 = block.getRelative(BlockFace.SOUTH_EAST);
                Block block6 = block.getRelative(BlockFace.SOUTH_WEST);
                Block block7 = block.getRelative(BlockFace.NORTH_EAST);
                Block block8 = block.getRelative(BlockFace.NORTH_WEST);

                casser(block1);
                casser(block2);
                casser(block3);
                casser(block4);
                casser(block5);
                casser(block6);
                casser(block7);
                casser(block8);
            }

            if (blockface.equals(BlockFace.EAST) || blockface.equals(BlockFace.WEST)){

                Block block1 = block.getRelative(BlockFace.UP);
                Block block2 = block.getRelative(BlockFace.DOWN);
                Block block3 = block.getRelative(BlockFace.NORTH);
                Block block4 = block.getRelative(BlockFace.SOUTH);
                Block block5 = block1.getRelative(BlockFace.NORTH);
                Block block6 = block1.getRelative(BlockFace.SOUTH);
                Block block7 = block2.getRelative(BlockFace.NORTH);
                Block block8 = block2.getRelative(BlockFace.SOUTH);

                casser(block1);
                casser(block2);
                casser(block3);
                casser(block4);
                casser(block5);
                casser(block6);
                casser(block7);
                casser(block8);
            }

            if (blockface.equals(BlockFace.NORTH) || blockface.equals(BlockFace.SOUTH)){

                Block block1 = block.getRelative(BlockFace.UP);
                Block block2 = block.getRelative(BlockFace.DOWN);
                Block block3 = block.getRelative(BlockFace.EAST);
                Block block4 = block.getRelative(BlockFace.WEST);
                Block block5 = block1.getRelative(BlockFace.EAST);
                Block block6 = block1.getRelative(BlockFace.WEST);
                Block block7 = block2.getRelative(BlockFace.EAST);
                Block block8 = block2.getRelative(BlockFace.WEST);

                casser(block1);
                casser(block2);
                casser(block3);
                casser(block4);
                casser(block5);
                casser(block6);
                casser(block7);
                casser(block8);
            }
        }
    }
}




