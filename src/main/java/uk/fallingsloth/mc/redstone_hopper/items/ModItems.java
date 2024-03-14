package uk.fallingsloth.mc.redstone_hopper.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import uk.fallingsloth.mc.redstone_hopper.RedstoneHopper;

public class ModItems
{
    public static final Item REDSTONE_HOPPER = registerItem("redstone-hopper", new Hopper);

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(RedstoneHopper.MOD_ID, name), item);
    }

    private static void addItemsToRedstoneGroup(FabricItemGroupEntries entries)
    {
        entries.add(REDSTONE_HOPPER);
    }

    public static void registerModItems()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneGroup);
    }
}
