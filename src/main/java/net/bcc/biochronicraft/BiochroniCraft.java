package net.bcc.biochronicraft;

import net.bcc.biochronicraft.server.ServerProxy;
import net.bcc.biochronicraft.server.block.BcCBlockRegistry;
import net.bcc.biochronicraft.server.item.BcCItemRegistry;
import net.ilexiconn.llibrary.common.content.ContentHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BiochroniCraft.MODID, name = "BiochroniCraft", version = BiochroniCraft.VERSION, dependencies = "required-after:llibrary@[" + BiochroniCraft.LLIBRARY_VERSION + ",)")
public class BiochroniCraft {
    public static final String MODID = "biochronicraft";
    public static final String VERSION = "v0.1.0";
    public static final String LLIBRARY_VERSION = "0.9.2";

    @Mod.Instance(MODID)
    public static BiochroniCraft instance;
    @SidedProxy(serverSide = "net.bcc.biochronicraft.server.ServerProxy", clientSide = "net.bcc.biochronicraft.client.ClientProxy")
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        ContentHelper.init(new BcCBlockRegistry(), new BcCItemRegistry());
        proxy.onPreInit();
    }

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        proxy.onInit();
    }

    @Mod.EventHandler
    public void onPostInit(FMLPostInitializationEvent event) {
        proxy.onPostInit();
    }
}
