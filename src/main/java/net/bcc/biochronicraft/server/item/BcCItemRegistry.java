package net.bcc.biochronicraft.server.item;

import net.ilexiconn.llibrary.common.content.IContentHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BcCItemRegistry implements IContentHandler{
    public static Item ingotPigIronIngot;

    @Override
    public void init(){
        ingotPigIronIngot = new IngotPigIronIngot().setUnlocalizedName("ingotpigironingot");
    }

    @Override
    public void gameRegistry() throws Exception{
        GameRegistry.registerItem(ingotPigIronIngot, "ingotpigironingot");
    }
}
