package net.lashev.candy.Item;


import net.lashev.candy.block.ModBlocks;
import net.minecraft.world.item. CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTab {
    public static final CreativeModeTab CANDY_TAB = new CreativeModeTab("Candy Tab"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.sweet_candy.get());
        }
    };
}