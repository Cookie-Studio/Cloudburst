package org.cloudburstmc.server.inventory;

import org.cloudburstmc.api.block.Block;
import org.cloudburstmc.api.inventory.Inventory;
import org.cloudburstmc.api.inventory.InventoryHolder;
import org.cloudburstmc.math.vector.Vector3i;
import org.cloudburstmc.server.level.CloudLevel;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class FakeBlockMenu implements InventoryHolder {

    private final Inventory inventory;
    private final Block blockState;

    public FakeBlockMenu(Inventory inventory, Block blockState) {
        this.inventory = inventory;
        this.blockState = blockState;
    }

    public Vector3i getPosition() {
        return blockState.getPosition();
    }

    public CloudLevel getLevel() {
        return blockState.getLevel();
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
