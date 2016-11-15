package com.teamavion.colorpower;

import com.teamavion.colorpower.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tjken on 11/9/2016.
 */

@Mod(modid = Ref.MODID + "core", version = Ref.VERSION)

public class ColorPowerMain {

    @Mod.Instance(value = Ref.MODID + "core")
    public static ColorPowerMain instance;

    @SidedProxy(clientSide = "com.teamavion.colorpower.proxy.ClientProxy", serverSide = "com.teamavion.colorpower.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    public static boolean isActive(int a)
    {
        return true;
    }

}
