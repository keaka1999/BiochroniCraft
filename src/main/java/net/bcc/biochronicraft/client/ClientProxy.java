package net.bcc.biochronicraft.client;

import net.bcc.biochronicraft.server.ServerProxy;
import net.bcc.biochronicraft.server.block.BcCBlockRegistry;
import net.bcc.biochronicraft.server.item.BcCItemRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends ServerProxy {
    @Override
    public void onPreInit() {

    }

    @Override
    public void onInit() {
        //Items Renderer
        BcCItemRenderer.registerItemRender();
    }

    @Override
    public void onPostInit() {
        //Block Renderer
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(BcCBlockRegistry.blockPigIronBlock), 0, new ModelResourceLocation("biochronicraft:blockpigironblock", "inventory"));
    }
}
