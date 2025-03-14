package com.example.mineralfarm.item;

import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

public class MineralEssenceItem extends Item {
    public MineralEssenceItem(Rarity rarity) {
        super(new Settings().rarity(rarity).maxCount(1));
    }
}
