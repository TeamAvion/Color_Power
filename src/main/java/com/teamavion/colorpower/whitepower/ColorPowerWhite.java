package com.teamavion.colorpower.whitepower;

import com.teamavion.colorpower.Ref;
import com.teamavion.colorpower.whitepower.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Tjken on 11/9/2016.
 */

@Mod(modid = Ref.MODID + "white", version = Ref.VERSION)

public class ColorPowerWhite {

    @Mod.Instance(value = Ref.MODID + "white")
    public static ColorPowerWhite instance;

    @SidedProxy(clientSide = "com.teamavion.colorpower.whitepower.proxy.ClientProxy", serverSide = "com.teamavion.colorpower.whitepower.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

}
