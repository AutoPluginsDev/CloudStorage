package fr.lumi.Inventories;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class StorageUnit {
    Inventory inventory;
    String name;
    public StorageUnit(String name) {
        this.name = name;
        createInventory();
    }

    public StorageUnit(String name, ItemStack[] items) {
        this.name = name;
        createInventory();
        inventory.setContents(items);
    }

    public void createInventory() {
        inventory = Bukkit.createInventory(null, 9, this.name);
    }

    public Inventory getInventory() {
        return inventory;
    }


}
