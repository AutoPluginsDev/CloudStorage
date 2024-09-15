package fr.lumi.Inventories;

import fr.lumi.Main;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;

public class CloudStorage {

    public Main plugin;

    ArrayList<StorageUnit> storageUnits = new ArrayList<>();

    public CloudStorage(Main plugin) {
        this.plugin = plugin;
    }

    public void createStorageUnit(String name) {
        StorageUnit storageUnit =  new StorageUnit(name);
        storageUnits.add(storageUnit);
    }

    public void removeStorageUnit(StorageUnit storageUnit) {
        storageUnits.remove(storageUnit);
    }

    public StorageUnit getStorageUnit(String name) {
        for(StorageUnit storageUnit : storageUnits) {
            if (storageUnit.name.equals(name)) {
                return storageUnit;
            }
        }
        return null;
    }


}
