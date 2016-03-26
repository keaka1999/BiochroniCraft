package net.bcc.biochronicraft.server.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockPigIronBlock extends Block {
        public BlockPigIronBlock(Material material) {
            super(material);

            this.setHardness(5.0f);
            this.setResistance(30.0f);
            this.setStepSound(soundTypeMetal);
            this.setCreativeTab(CreativeTabs.tabBlock);
        }
}
