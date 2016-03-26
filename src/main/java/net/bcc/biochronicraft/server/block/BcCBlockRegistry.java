package net.bcc.biochronicraft.server.block;

import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BcCBlockRegistry implements IContentHandler{
    public static Block blockPigIronBlock;

    @Override
    public void init(){
        blockPigIronBlock = new BlockPigIronBlock(Material.rock).setUnlocalizedName("blockpigironblock");
    }

    @Override
    public void gameRegistry() throws Exception{
        GameRegistry.registerBlock(blockPigIronBlock, "blockpigironblock");
    }
}
