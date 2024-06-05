package net.lashev.candy.block;
import net.lashev.candy.Candy;
import net.lashev.candy.Item.ModCreativeModeTab;
import net.lashev.candy.Item.ModItem;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus. api. IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister. create(ForgeRegistries. BLOCKS, Candy.MOD_ID);
    public static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItem.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }


    public static final RegistryObject<Block> pink_candy = registryBlock("pink_candy",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(3f)
                    .noOcclusion()
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.CANDY_TAB);

    public static final RegistryObject<Block> cake = registryBlock("cake",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(3f)
                    .noOcclusion()
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.CANDY_TAB);
    public static final RegistryObject<Block> chocolate = registryBlock("chocolate",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(3f)
                    .noOcclusion()
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.CANDY_TAB);
    public static final RegistryObject<Block> red_candy = registryBlock("red_candy",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(3f)
                    .noOcclusion()
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.CANDY_TAB);
}
