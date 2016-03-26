package net.bcc.biochronicraft.server.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BcCItemRenderer {
    public static void registerItemRender(){
        //Items Registry
        registerItem(BcCItemRegistry.ingotPigIronIngot);
    }
    public static void registerItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(BcCItemRegistry.ingotPigIronIngot, 0, new ModelResourceLocation("biochronicraft:ingotpigironingot", "inventory"));
    }
}
