package net.lashev.candy.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.lashev.candy.Candy;
import net.minecraftforge.registries.RegistryObject;


public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Candy.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> sweet_candy = ITEMS.register ("sweet_candy",
            () -> new Item(new Item. Properties(). tab(ModCreativeModeTab.CANDY_TAB)));
    public static final RegistryObject<Item> candies_with_hold = ITEMS.register ("candies_with_hold",
            () -> new Item(new Item. Properties(). tab(ModCreativeModeTab.CANDY_TAB)));
    public static final RegistryObject<Item> yellow_candy = ITEMS.register ("yellow_candy",
            () -> new Item(new Item. Properties(). tab(ModCreativeModeTab.CANDY_TAB)));
    public static final RegistryObject<Item> candy_in_a_wrapper = ITEMS.register ("candy_in_a_wrapper",
            () -> new Item(new Item. Properties(). tab(ModCreativeModeTab.CANDY_TAB)));
}