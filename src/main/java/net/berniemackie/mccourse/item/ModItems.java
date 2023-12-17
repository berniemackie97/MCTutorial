package net.berniemackie.mccourse.item;

import net.berniemackie.mccourse.MCCourseMod;
import net.berniemackie.mccourse.item.custom.FuelItem;
import net.berniemackie.mccourse.item.custom.MetalDetectorItem;
import net.berniemackie.mccourse.item.custom.PaxelItem;
import net.berniemackie.mccourse.util.ModTags;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    // Create a DeferredRegister for items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);


    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));


    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().rarity(Rarity.EPIC).durability(512)));



    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC).food(ModFoodProperties.KOHLRABI)));



    public static final RegistryObject<Item> PEAT_BRICK = ITEMS.register("peat_brick",
            () -> new FuelItem(new Item.Properties(), 200));


//tier, attackDamage Modifier, attackSpeed Modifier
    public static final RegistryObject<Item> ALEXANDRITE_SWORD = ITEMS.register("alexandrite_sword",
            () -> new SwordItem(ModToolTiers.ALEXANDRITE, 5, 3.0F,
                    new Item.Properties().durability(256).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> ALEXANDRITE_PICKAXE = ITEMS.register("alexandrite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ALEXANDRITE, 3, 3.0F,
                    new Item.Properties().durability(256).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ALEXANDRITE_SHOVEL = ITEMS.register("alexandrite_shovel",
            () -> new ShovelItem(ModToolTiers.ALEXANDRITE, 3, 3.0F,
                    new Item.Properties().durability(256).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ALEXANDRITE_AXE = ITEMS.register("alexandrite_axe",
            () -> new AxeItem(ModToolTiers.ALEXANDRITE, 3, 3.0F,
                    new Item.Properties().durability(256).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ALEXANDRITE_HOE = ITEMS.register("alexandrite_hoe",
            () -> new HoeItem(ModToolTiers.ALEXANDRITE, 2, 3.0F,
                    new Item.Properties().durability(256).rarity(Rarity.EPIC)));

    //float pAttackDamageModifier, float pAttackSpeedModifier, Tier pTier, Properties pProperties
    public static final RegistryObject<Item> ALEXANDRITE_PAXEL = ITEMS.register("alexandrite_paxel",
            () -> new PaxelItem(5, 3.0F, ModToolTiers.ALEXANDRITE,
                    new Item.Properties().durability(556).rarity(Rarity.EPIC)));



    public static void register(IEventBus eventBus) {
        // Register the DeferredRegister to the event bus
        ITEMS.register(eventBus);
    }
}
